<template>
  <page41 v-if="page == 41"></page41>
  <page42 v-if="page == 42"></page42>
  <page43 v-if="page == 43"></page43>
  <page44 v-if="page == 44"></page44>
  <page46 v-if="page == 46"></page46>
  <page46a v-if="page == '46a'"></page46a>
</template>

<script>
import page41 from '../pages/pageCh41.vue'
import page42 from '../pages/pageCh42.vue'
import page43 from '../pages/pageCh43.vue'
import page44 from '../pages/pageCh44.vue'
import page46 from '../pages/pageCh46.vue'
import page46a from '../pages/pageCh46a.vue'
import bus from './bus.ts'
export default {
    name:"pageviwer",
    components:{
        page41,
        page42,
        page43,
        page44,
        page46,
        page46a,
    },
    data(){
        return{
            page:0,
        }
    },
    mounted(){
        bus.on('page',page=>{
            this.page = page;
            if (page!=0) {
                bus.emit('status','read')
            }
        })
    }
}
</script>

<style>

</style>