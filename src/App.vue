<template>
  <div class="wraper" @click="guild">
    <header>
      <h1>Java編程培訓</h1>
      <h2>作者:Dr. Heh-Tyan Liaw</h2>
    </header>
    <article>
      <h1>第一學期</h1>
      &nbsp;
      <h2>JAVA與資料結構</h2>
    </article>
  </div>
  <div :class="{ishide:isact==false}">
    <parts class="test"></parts>
  </div>
  <page :page="'/pages/pageCh41.htm'"></page>
</template>
<script>
import parts from './components/class.vue'
import page from './components/pageshower.vue'
export default {
  name: 'App',
  data(){
    return{
      isact:false
    }
  },
  components:{
    parts,
    page
  },
  methods:{
    guild(){
      this.isact=!this.isact
    }
  }
}
</script>

<style>
*{
  margin: 0px;
  padding: 0px;
}
html,body{
  width: 100%;
  height: 100%;
}
body{
    display: flex;
    justify-content: center;
    align-items: center;
}
.wraper {
  width: 100%;
  padding: 1%;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  font-size: 30px;
  border: solid .1em rgba(51, 51, 51,.7);
  border-radius: .3em;
  cursor: pointer;
  box-shadow: .3em .3em .1em 0 rgb(0 0 0 / 21%);
  transition: all 0.2s;
  background-color: #fff;
}
.wraper:hover{
  font-size: 30.5px;
  padding: 1.25%;
}
article{
  display: flex;
  justify-content: center;
}
h1,h2{
  color: #333;
  margin-bottom: .5em;
  opacity: .9;
}
.ishide{
  opacity: 0;
  position: absolute;
  top: 50%;
}
.test{
  transition: all .5s;
}
</style>
