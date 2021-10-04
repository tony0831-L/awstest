<template>
<div class="pageWraper">
       <div class="title"><h2>Ch46 分支   </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>
<h3> 1. if-else </h3>
     <p> <a href="branch1.GIF">branch1.GIF</a></p> 
     <p> <a href="Branch1.java">Branch1.java</a></p> 
     <p> <a href="Branch2.java">Branch2.java</a></p> 

<h3> 2. if </h3>
     <p> <a href="branch3.GIF">branch3.GIF</a></p> 
     <p> 由cpp自行改寫成java: <a href="Branch3.java">Branch3.java</a></p> 

<h3> 3. nested if </h3>
     <p> <a href="nestBranch.GIF">nestBranch.GIF</a></p> 
     <p> 由 <a href="PN_xy.cpp">PN_xy.cpp</a> 自行改成java</p>

<h3> 4. if-else-if </h3>
     <p> <a href="elseif.GIF">elseif.GIF</a></p> 
     <p> 由 <a href="ScoreRank.cpp">ScoreRank.cpp</a>
         改成 <a href="ScoreRank.java">ScoreRank.java</a></p> 
     <p> 由 <a href="PZN_xy.cpp">PZN_xy.cpp</a>
         自行改成 <a href="PZN_xy.java">PZN_xy.java</a></p> 
     
<h3> 5. switch-case </h3>
     <p> <a href="switch.GIF">switch.GIF</a></p> 
     <p> 由 <a href="Poker.cpp">Poker.cpp</a>
         改成 <a href="Poker.java">Poker.java</a></p> 
     <p> 另一種寫法: <a href="Poker1.java">Poker1.java</a></p> 
     <p> 由 <a href="MonthName.cpp">MonthName.cpp</a> 自寫 MonthName.java </p> 

<h3> 6. break with label, continue with label </h3>
     <p> 若要跳出深層迴圈或若switch與迴圈混用, 
         break及continue 可以指定label. </p> 
     <p> 在case中跳出for的實例: <a href="ForSw_break.java">ForSw_break.java</a></p> 
</div>
</template>

<script>
import bus from '../components/bus.ts'
export default {
     name:"page46",
     methods:{
          back(){
               bus.emit('status','back')
               bus.emit('page',0)
          }
     }
}
</script>

<style scoped>
     .pageWraper{
          border: solid .2em #333;
          padding: 1% 2%;
          border-radius: .3em;
          box-shadow: .5em .5em .05em 0 rgb(0 0 0 / 21%);
     }
     *{
          font-family: 'Noto Sans TC', '微軟正黑體', sans-serif;
          margin-bottom: .15em;
     }
     h2{
          font-size: 1.5rem;
          margin-bottom: .2em;
          color: #333;
     }
     p{
          font-size: 1rem;
          color: #333;
     }
     .title{
          display: flex;
          font-size: 1.25rem;
          margin-bottom: .2em;
          color: #333;
          align-items: center;
     }
     .title i{
          cursor: pointer;
     }
</style>