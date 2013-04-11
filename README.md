iHelp-Government
================
蘋果日報：
http://www.appledaily.com.tw/appledaily/article/headline/20130103/34746120/

簡報：
http://www.slideshare.net/stuvul3jo3/ksdg-ihelp?fb_action_ids=617288874955163&fb_action_types=slideshare%3Adownload&fb_source=timeline_og&action_object_map=%7B%22617288874955163%22%3A401248026637927%7D&action_type_map=%7B%22617288874955163%22%3A%22slideshare%3Adownload%22%7D&action_ref_map=%5B%5D

1. 機器人一小步：聾人生命一大步 蔡佳緯 begining1003@gmail.com
2. 自我介紹• 樹德科技大學 - 資訊工程系• GitHub – webbertsai
3. 何謂聾人
4. 聾人溝通方式
5. • 文字• 手語
6. 臺灣聾人報案管道
7. • 報案專線 ｜ 臺灣警政署提供• 新北市報案App｜ 工研院研發• 簡訊報案App ｜ 新竹市政府
8. 聾人報案困難點
9. 1. 無法發聲及聽2. 對外聯絡管道分散3. 報案方式繁瑣
10. iHelp 初步流程圖
11. 使用者輸入求 救訊息求救訊息透過TTS 轉為音檔 撥『110』電 話並將音檔播 出對方聲音透過SR 轉換文字
12. Text to speech
13. 檢查語言包• Intent checkTTS = new Intent();• checkIntent.setAction(TextToSpeech.Engine);• startActivityForResult(checkTTS, STATUS);
14. onActivityResult• CHECK_VOICE_DATA_PASS• CHECK_VOICE_DATA_BAD_DATA• CHECK_VOICE_DATA_MISSING_DATA• CHECK_VOICE_DATA_MISSING_VOLUME
15. 語言包下載• Intent TTS_Data = new Intent();• TTS_Data.setAction(TextToSpeech.Engine);
16. TextToSpeech• mTTS = new TextToSpeech(this, this);• mTTS.setLanguage(Locale.US);• mTTS.speak(“test", TextToSpeech.QUEUE, null);
17. synthesizeToFile• myHash = new HashMap<String, String>();• String wakeUpText = ”test";• String destFileName = "/sdcard/test.wav";• myHash.put(TextToSpeech.Engine.KEY_PARAM_UTT ERANCE_ID, wakeUpText);• mTTS.synthesizeToFile(wakuUpText, myHash , destFileName);
18. Phone call status
19. PhoneStateListener• onCallStateChanged – CALL_STATE_IDLE 電話撥出結束 – CALL_STATE_OFFHOOK 通話中 – CALL_STATE_RINGING 有電話打來
20. Phone Source Code1. mPhone.getState() // 是否通話2. ringingCall.getState().isAlive() // 是否接通
21. 老師：比賽剩三天
22. iHelp 簡化架構圖
23. 比賽正式開始
24. 客戶端 (智慧型手機)
25. 主要頁面
26. 個人資料
27. 選擇災情及人數
28. 報案完成
29. 客戶端 (Wimm)
30. Server 端
31. 尚未救援
32. 救援成功
33. 救護端
34. 路徑規劃
35. 報案者詳細資料
36. 行動終端應用軟體創作專題競賽
37. 功能加強/校正
38. Opengeosms
39. 報案端
40. Facebook
41. 緊急聯絡人
42. 與救難單位端互動
43. 搶鮮大賽 – 冠軍
44. 預期應該會
45. 簡訊服務• Http SMS 服務• SMS 伺服器
46. 實際
47. HiNet寄簡訊• $mysms = new sms2();• $mysms -> send_text( $mobile, $message);
48. 與警政署洽談介接
49. 專利
50. Demo
51. 政府版本 iHelp
52. Q&A
