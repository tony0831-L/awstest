<template>
<div class="pageWraper">
       <div class="title"><h2>Ch41 java起步 </h2> &nbsp;<i class="bi bi-arrow-left-circle" @click="back"></i></div>
<h3> 1. 復習大一資料 </h3>
     <p>
        <a href="Ch02_T2_DOS_cmds.pdf">Ch02_T2_DOS_cmds</a>, 
        <a href="Ch02_T3_EnvVar.pdf">Ch02_T3_EnvVar</a>, 
        <a href="Ch02_T4_CmdPath.pdf">Ch02_T4_CmdPath</a>, 
     <br/> <a href="Ch03_P1_language.pdf">Ch03_P1_language</a>, 
        <a href="Ch03_P2_compile.pdf">Ch03_P2_compile</a> 
     </p>

<h3> 2. 基本DOS操作及java操作 </h3>
     <p><a href="Ch41A_ElemDOS.txt">基本DOS操作</a></p>
     <p><a href="Ch41B_download.txt">java下載及安裝</a></p>
     <p><a href="Ch41C_javaPath.txt">DOS視窗與java路徑設定</a></p>
     <p><a href="Ch41D_javaStart.txt">java程式設計的過程</a></p>
     <p><a href="Ch41E_OperateSample.txt">操作實例</a></p>

<h3> 3. 程式排版 </h3>
     <p>編輯器的重要設定: tab自動轉空格. 自行參閱Ch01</p>  
     <p>程式碼縮排(indent)</p>  
     <p> 關縮排及設定TAB <a href="indent_TAB.txt">indent_TAB.txt</a> </p> 


<h3> 4. 簡單的程式 </h3>
     <p><a href="Hello.java">Hello.java</a>, 
        <a href="Hello1.java">Hello1.java</a></p>

<h3> 5. 控制碼與Unicode</h3>
     <p>控制碼 <a href="HKT.java">HKT.java</a>, <a href="Backspace.java">Backspace.java</a></p>
     <p>Unicode <a href="Unicode.txt">說明</a>, <a href="Unicode.java">Unicode.java</a></p>
     <p>中文表格字 <a href="Prog6X.java">Prog6X.java</a></p>

<h3> 6. java的字串相接</h3>
     <p><a href="T2_stringConcate.GIF">說明</a></p>
     <p>字串相接 <a href="Prog5.java">Prog5.java</a></p>
</div>
</template>

<script>
import bus from '../components/bus.ts'
export default {
     name:"page41",
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