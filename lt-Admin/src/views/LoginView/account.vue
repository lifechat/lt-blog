<template>
  <el-form
    ref="ruleFormRef"
    :model="ruleForm"
    status-icon
    :rules="rules"
    size="large"
    class="login-content-form"
  >
    <el-form-item class="login-animation1">
      <el-input
        v-model.trim="ruleForm.username"
        text
        clearable
        placeholder="请输入您的用户名"
        autocomplete="off"
        @keyup.enter.native="handleLogin"
      >
        <template #prefix>
          <el-icon class="el-input__icon"><ele-User /></el-icon>
        </template>
      </el-input>
    </el-form-item>
    <el-form-item class="login-animation2">
      <el-input
        v-model.trim="ruleForm.password"
        placeholder="请输入您的密码"
        show-password
        clearable
        autocomplete="off"
        @keyup.enter.native="handleLogin"
      >
        <template #prefix>
          <el-icon class="el-input__icon"><ele-Unlock /></el-icon>
        </template>
        <template #suffix>
          <i class="iconfont el-input__icon login-content-password"></i>
        </template>
      </el-input>
    </el-form-item>
    <el-form-item class="login-animation4">
      <el-button
        type="primary"
        class="login-content-submit"
        round
        @click="submitForm(ruleFormRef)"
      >
        <span>登录</span>
      </el-button>
    </el-form-item>
  </el-form>
</template>

<script setup lang="ts" name="loginAccount">
import type { FormInstance, FormRules } from "element-plus";
import { ref, reactive } from "vue";
import { useRouter } from "vue-router";
import { handleRquestLogin } from "@/api/login";

const router = useRouter();
// 定义变量
const ruleForm = reactive({
  username: "",
  password: "",
});

const handleLogin = () => {};

const ruleFormRef = ref<FormInstance>();

const validateUsername = (value: any, callback: any) => {
  if (value === "") {
    callback(new Error("请输入你的用户名"));
  } else {
    callback();
  }
};
const validatePass = ( value: any, callback: any) => {
  if (value === "") {
    callback(new Error("请输入你的密码"));
  } else {
    callback();
  }
};

const rules = reactive<FormRules>({
  username: [{ validator: validateUsername, trigger: "blur" }],
  pass: [{ validator: validatePass, trigger: "blur" }],
});

const submitForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return;
  formEl.validate(async (valid) => {
    if (valid) {
      const params = {
        username: ruleForm.username,
        password: ruleForm.password,
      };
      const res = await handleRquestLogin(params);
	  if(res.flag=true){
		router.push("/");
	  }
    }
  });
};
</script>

<style scoped lang="scss">
.login-content-form {
  margin-top: 20px;
  @for $i from 1 through 4 {
    .login-animation#{$i} {
      opacity: 0;
      animation-name: error-num;
      animation-duration: 0.5s;
      animation-fill-mode: forwards;
      animation-delay: calc($i/10) + s;
    }
  }
  .login-content-password {
    display: inline-block;
    width: 20px;
    cursor: pointer;
    &:hover {
      color: #909399;
    }
  }
  .login-content-code {
    width: 100%;
    padding: 0;
    font-weight: bold;
    letter-spacing: 5px;
  }
  .login-content-submit {
    width: 100%;
    letter-spacing: 2px;
    font-weight: 300;
    margin-top: 15px;
  }
}
</style>
