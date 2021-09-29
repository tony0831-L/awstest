<template>
    <div class="parts">
        <part v-for="(i,index) in part" :key="index" :title="i" v-show="index<nts&&index>=nts-3"></part>
        <i class="bi bi-caret-right-fill" @click="next" ></i>
    </div>
</template>

<script>
import part from './parts.vue'
export default {
    name:"parts",
    data(){
        return{
            nts:3,
            part:["Part 1 流程","Part2 陣列(一)","Part 3 函數","Part 4 物件","Part 5 陣列(二)","Part 6 樹(一)"]
        }
    },
    methods:{
        next(){
            if (this.nts!=6) {
                this.nts*=2
            }else{
                this.nts=3
            }
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
