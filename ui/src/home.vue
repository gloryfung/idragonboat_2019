<template>
    <div>
        <h1>home.vue组件 {{msg}}</h1>
        <mt-button type="primary" @click="alertMsg">primary</mt-button>
        <button type="button" class="mui-btn mui-btn-royal">紫色</button>
    </div>
</template>

<script>

import { Toast } from 'mint-ui';

    export default {
        data() { //组件中的data必须是funciton
            return {
                msg : 'happy',
            }
        },
        methods : {
            show() {
                console.log("home.vue中调用了一个show的方法")
            },
            alertMsg() {
                Toast("提示信息");
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>