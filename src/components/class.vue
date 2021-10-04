<template>
    <div class="parts">
        <part v-for="(i,index) in part" :key="index" :title="i" v-show="index<nts&&index>=nts-3" @click="showcli(i)"></part>
        <i class="bi bi-caret-right-fill" @click="next" ></i>
    </div>
    <div class="parts" v-show="cla=='Part 1 流程'">
        <part v-for="(i,index) in part1" :key="index" :title="i" v-show="index<nty&&index>=nty-2" @click="gotopage(i)"></part>
        <i class="bi bi-caret-right-fill" @click="nextp" ></i>
    </div>
</template>

<script>
import part from './parts.vue'
import bus from './bus.ts'
export default {
    name:"parts",
    data(){
        return{
            nts:3,
            nty:2,
            part:["Part 1 流程","Part2 陣列(一)","Part 3 函數","Part 4 物件","Part 5 陣列(二)","Part 6 樹(一)"],
            cla:"",
            part1:["Ch41 java起步","Ch42 直線型的程式","Ch43 單層迴圈","Ch44 雙層迴圈","Ch46 分支","Ch46a 特殊技巧"]
        }
    },
    methods:{
        next(){
            if (this.nts!=6) {
                this.nts*=2
            }else{
                this.nts=3
            }
        },
        nextp(){
            if (this.nty!=6) {
                this.nty+=2
            }else{
                this.nty=2
            }
        },
        showcli(name){
            this.cla=name
        },
        gotopage(page){
            if(page=="Ch41 java起步"){
                bus.emit('page',41)
            }else if(page=="Ch42 直線型的程式"){
                bus.emit('page',42)
            }else if(page=="Ch43 單層迴圈"){
                bus.emit('page',43)
            }else if(page=="Ch44 雙層迴圈"){
                bus.emit('page',44)
            }else if(page=="Ch46 分支"){
                bus.emit('page',46)
            }else if(page=="Ch46a 特殊技巧"){
                bus.emit('page',"46a")
            }else{
                alert("comming soon")
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
