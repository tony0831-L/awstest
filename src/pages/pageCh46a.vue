<template>
<div class="pageWraper">
       <div class="title"><h2>Ch46a 特殊技巧   </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>

<h3> 1. 複合運算符 </h3>
     <p> <a href="opr1.GIF">++, --, +=, -=, *=, ...</a></p> 

<h3> 2. 關係運算符 </h3>
     <p> <a href="cpxCond.GIF"> 複合關係 </a></p> 
     <p> <a href="opr2.GIF"> 大於, 小於, ...</a></p> 
     <p> DeMorgan's law:  <br/>
         !(p && q) 等於 !p || !q <br/> 
         !(p || q) 等於 !p && !q <br/> 
     </p> 

<h3> 3. 短路規則 </h3>
     <p> <a href="shortFlow.GIF">說明</a></p> 
     <p> <a href="ShortFlow1.java">ShortFlow1.java</a> </p> 
     
<h3> 4. 三元算式</h3>
     <p> cond? tExp: fExp </p> 

     
<h3> 5. 數學程式庫 java.lang.Math </h3>
     <p> import static </p>

     <p>開根號 <a href="Prog11.java">Prog11.java</a></p>
     <p>三角函數 <a href="Prog12a.java">Prog12a.java</a></p>
     <p>反三角函數 <a href="Prog12b.java">Prog12b.java</a></p>
     <p>兩倍角公式 <a href="Prog12c.java">Prog12c.java</a></p>

     <p>四捨五入  <a href="DemoRound.java">DemoRound.java</a> </p>
     <p>隨機數  <a href="DemoRandom.java">DemoRandom.java</a> </p>

<h3> 6. 自製簡易函數 </h3>
     <p>自製函數來做四捨五入 <a href="Prog12aR.java">Prog12aR.java</a></p>
     <p>子字串 String.substring(int from, int to), 取 from 到 to-1 </p>
     <p>自製函數來控制輸出寬度 <a href="Prog12aW.java">Prog12aW.java</a></p>

<h3> 7. bit運算 </h3>
     <p> bitwise operators <a href="opr3.GIF"> 說明(opr3.GIF) </a></p>
     <p> ~ bit否, & bit且, | bit或, ^bit斥或.   
         程式 <a href="BitOp1.java"> BitOp1.java</a> </p>
     <p>&lt;&lt; 左移, >> 算術右移, >>> 邏輯右移.    
         程式 <a href="BitOp2.java"> BitOp2.java</a> </p>
     <p> 存取單一bit <a href="opr4.GIF"> 說明(opr4.GIF) </a></p>
     <p> &=, |=, ^=, &lt;&lt;=, >>=, >>>=  </p> 
     <p> 編碼與解碼 <a href="BitOp3.java"> BitOp3.java</a> </p>
     <p> 學過陣列以後再讀: <a href="BitOp4.java"> BitOp4.java</a> </p>
     
     
<!-- 移前
<h3> 6. 跳出深層迴圈 </h3>
     <p>指定lable的break<a href="For_break.java">For_break.java</a></p>
-->

</div>
</template>

<script>
import bus from '../components/bus.ts'
export default {
     name:"page46a",
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