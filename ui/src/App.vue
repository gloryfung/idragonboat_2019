<template>
    <div id="appContainer">
        <!-- 顶部Header区域 -->
        <mt-header fixed title="我的应用"></mt-header>
        <h1>这是我的应用</h1>
        <!-- 中间路由的router-view区域 -->


        <!-- 底部Tabber区域 -->


    </div>
</template>

<script>

    export default {
        data() { //组件中的data必须是funciton
            return {
                
            }
        },
        methods : {
            
        }
    }
</script>

<style lang="scss" scoped>
    // 预留header高度
    #appContainer {
        padding-top: 40px;
    }
</style>