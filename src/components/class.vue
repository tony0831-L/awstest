<template>
    <div class="parts">
        <part v-for="(i,index) in part" :key="index" :title="i"></part>
        <i class="bi bi-caret-right-fill"></i>
    </div>
</template>

<script>
import part from './parts.vue'
export default {
    name:"parts",
    data(){
        return{
            part:["Ch41 java起步","Part2 陣列(一)","Part 3 函數"]
        }
    },
    components:{
        part
    },
}
</script>

<style scoped>
    .parts{
        margin-top: 4%;
        display: flex;
        justify-content: space-around;
    }
    i{
        font-size: 2em;
        opacity: .8;
        color: #333;
        cursor: pointer;
    }
    i:hover{
        font-size: 2.1em;
    }
</style>