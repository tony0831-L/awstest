<template>
  <page41 v-show="page == 41"></page41>
  <page42 v-show="page == 41"></page42>
</template>

<script>
import page41 from '../pages/pageCh41.vue'
import page42 from '../pages/pageCh42.vue'
import bus from './bus.ts'
export default {
    name:"pageviwer",
    components:{
        page41,
        page42
    },
    data(){
        return{
            page:0,
        }
    },
    mounted(){
        bus.on('page',page=>{
            this.page = page;
        })
    }
}
</script>

<style>

</style>