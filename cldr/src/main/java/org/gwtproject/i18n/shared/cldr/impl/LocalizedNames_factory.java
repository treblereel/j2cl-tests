/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

import org.gwtproject.i18n.shared.cldr.LocalizedNames;

public class LocalizedNames_factory {

 public static LocalizedNames create(){

   if("".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl();
   }

   /*
   if("fi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fi();
   }

   if("ksf".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ksf();
   }

   if("ks".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ks();
   }

   if("ce".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ce();
   }

   if("khq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_khq();
   }

   if("mgo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mgo();
   }

   if("nnh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nnh();
   }

   if("zh_Hant_MO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh_Hant_MO();
   }

   if("en".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_en();
   }

   if("my".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_my();
   }

   if("sg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sg();
   }

   if("cu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_cu();
   }

   if("or".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_or();
   }

   if("uz".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_uz();
   }

   if("hr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_hr();
   }

   if("ccp".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ccp();
   }

   if("fy".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fy();
   }

   if("fa_AF".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fa_AF();
   }

   if("es_419".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_419();
   }

   if("tr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_tr();
   }

   if("es_CO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_CO();
   }

   if("sq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sq();
   }

   if("te".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_te();
   }

   if("ln".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ln();
   }

   if("ff".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ff();
   }

   if("sw".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sw();
   }

   if("ar_LY".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ar_LY();
   }

   if("es_DO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_DO();
   }

   if("sbp".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sbp();
   }

   if("ps".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ps();
   }

   if("lag".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lag();
   }

   if("to".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_to();
   }

   if("es_MX".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_MX();
   }

   if("guz".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_guz();
   }

   if("dz".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dz();
   }

   if("es_SV".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_SV();
   }

   if("sw_KE".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sw_KE();
   }

   if("sd".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sd();
   }

   if("luo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_luo();
   }

   if("ko_KP".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ko_KP();
   }

   if("mr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mr();
   }

   if("eu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_eu();
   }

   if("gsw".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_gsw();
   }

   if("tzm".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_tzm();
   }

   if("pt_GW".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_GW();
   }

   if("th".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_th();
   }

   if("ja".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ja();
   }

   if("sn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sn();
   }

   if("luy".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_luy();
   }

   if("dsb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dsb();
   }

   if("it".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_it();
   }

   if("yi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yi();
   }

   if("nmg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nmg();
   }

   if("sah".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sah();
   }

   if("hy".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_hy();
   }

   if("ar".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ar();
   }

   if("ar_SA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ar_SA();
   }

   if("es_BO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_BO();
   }

   if("naq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_naq();
   }

   if("mgh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mgh();
   }

   if("he".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_he();
   }

   if("zgh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zgh();
   }

   if("bg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bg();
   }

   if("de_CH".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_de_CH();
   }

   if("dua".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dua();
   }

   if("ki".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ki();
   }

   if("pt_LU".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_LU();
   }

   if("uz_Arab".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_uz_Arab();
   }

   if("vo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_vo();
   }

   if("ig".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ig();
   }

   if("dje".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dje();
   }

   if("sk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sk();
   }

   if("vai_Latn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_vai_Latn();
   }

   if("sr_Latn_ME".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Latn_ME();
   }

   if("mzn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mzn();
   }

   if("kok".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kok();
   }

   if("ia".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ia();
   }

   if("wo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_wo();
   }

   if("es_CL".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_CL();
   }

   if("fr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fr();
   }

   if("ko".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ko();
   }

   if("ksb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ksb();
   }

   if("mas".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mas();
   }

   if("mfe".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mfe();
   }

   if("nyn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nyn();
   }

   if("ti".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ti();
   }

   if("gu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_gu();
   }

   if("yav".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yav();
   }

   if("am".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_am();
   }

   if("id".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_id();
   }

   if("ru".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ru();
   }

   if("az".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_az();
   }

   if("bas".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bas();
   }

   if("kl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kl();
   }

   if("bn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bn();
   }

   if("de_AT".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_de_AT();
   }

   if("mua".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mua();
   }

   if("ku".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ku();
   }

   if("ms".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ms();
   }

   if("pa".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pa();
   }

   if("nd".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nd();
   }

   if("ro".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ro();
   }

   if("uk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_uk();
   }

   if("ga".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ga();
   }

   if("fo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fo();
   }

   if("lg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lg();
   }

   if("ug".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ug();
   }

   if("brx".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_brx();
   }

   if("ky".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ky();
   }

   if("vi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_vi();
   }

   if("bez".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bez();
   }

   if("mi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mi();
   }

   if("hi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_hi();
   }

   if("ebu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ebu();
   }

   if("kkj".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kkj();
   }

   if("pt_MO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_MO();
   }

   if("pt_GQ".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_GQ();
   }

   if("as".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_as();
   }

   if("yo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yo();
   }

   if("saq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_saq();
   }

   if("af".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_af();
   }

   if("lt".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lt();
   }

   if("nn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nn();
   }

   if("az_Cyrl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_az_Cyrl();
   }

   if("os".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_os();
   }

   if("seh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_seh();
   }

   if("de".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_de();
   }

   if("sr_Cyrl_ME".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Cyrl_ME();
   }

   if("pt_MZ".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_MZ();
   }

   if("gd".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_gd();
   }

   if("ml".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ml();
   }

   if("pt_CH".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_CH();
   }

   if("et".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_et();
   }

   if("sw_CD".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sw_CD();
   }

   if("bem".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bem();
   }

   if("pt_CV".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_CV();
   }

   if("ur_IN".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ur_IN();
   }

   if("mt".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mt();
   }

   if("asa".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_asa();
   }

   if("teo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_teo();
   }

   if("om".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_om();
   }

   if("mg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mg();
   }

   if("vai".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_vai();
   }

   if("bo_IN".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bo_IN();
   }

   if("zh_Hant_TW".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh_Hant_TW();
   }

   if("se_FI".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_se_FI();
   }

   if("haw".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_haw();
   }

   if("es_HN".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_HN();
   }

   if("cgg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_cgg();
   }

   if("bo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bo();
   }

   if("chr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_chr();
   }

   if("kk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kk();
   }

   if("nl_BE".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nl_BE();
   }

   if("es_AR".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_AR();
   }

   if("gl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_gl();
   }

   if("es".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es();
   }

   if("sr_Cyrl_XK".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Cyrl_XK();
   }

   if("sl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sl();
   }

   if("nds".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nds();
   }

   if("rwk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_rwk();
   }

   if("br".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_br();
   }

   if("tt".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_tt();
   }

   if("zh_Hant".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh_Hant();
   }

   if("be".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_be();
   }

   if("si".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_si();
   }

   if("fa".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fa();
   }

   if("yue_Hans".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yue_Hans();
   }

   if("lv".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lv();
   }

   if("nus".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nus();
   }

   if("ewo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ewo();
   }

   if("nb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nb();
   }

   if("ksh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ksh();
   }

   if("es_EC".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_EC();
   }

   if("ast".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ast();
   }

   if("da".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_da();
   }

   if("ses".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ses();
   }

   if("dyo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dyo();
   }

   if("pt_PT".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_PT();
   }

   if("zu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zu();
   }
   if("sr_Latn_BA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Latn_BA();
   }

   if("zh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh();
   }

   if("twq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_twq();
   }

   if("cs".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_cs();
   }

   if("sr_Cyrl_BA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Cyrl_BA();
   }

   if("lrc".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lrc();
   }

   if("kln".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kln();
   }

   if("kam".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kam();
   }

   if("pt_AO".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_AO();
   }

   if("ne".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ne();
   }

   if("en_GB".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_en_GB();
   }

   if("agq".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_agq();
   }

   if("rn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_rn();
   }

   if("es_PA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_PA();
   }

   if("ka".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ka();
   }

   if("bs_Cyrl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bs_Cyrl();
   }

   if("sr_Latn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Latn();
   }

   if("kn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kn();
   }

   if("es_US".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_US();
   }

   if("pt_ST".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_ST();
   }

   if("fr_CA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fr_CA();
   }

   if("ur".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ur();
   }

   if("kea".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kea();
   }

   if("hsb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_hsb();
   }

   if("jv".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_jv();
   }

   if("ro_MD".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ro_MD();
   }

   if("kw".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kw();
   }

   if("smn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_smn();
   }

   if("ii".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ii();
   }

   if("pt".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt();
   }

   if("mer".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mer();
   }

   if("zh_Hant_HK".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh_Hant_HK();
   }

   if("sr_Latn_XK".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr_Latn_XK();
   }

   if("ru_UA".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ru_UA();
   }

   if("pl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pl();
   }

   if("bs".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bs();
   }

   if("kab".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kab();
   }

   if("yue".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yue();
   }

   if("lu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lu();
   }

   if("ak".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ak();
   }

   if("tk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_tk();
   }

   if("fr_BE".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fr_BE();
   }

   if("xog".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_xog();
   }

   if("es_VE".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_VE();
   }

   if("dav".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_dav();
   }

   if("rm".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_rm();
   }

   if("mk".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mk();
   }

   if("es_NI".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_NI();
   }

   if("jgo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_jgo();
   }

   if("ta".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ta();
   }

   if("cy".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_cy();
   }

   if("es_PR".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_PR();
   }

   if("pt_TL".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pt_TL();
   }

   if("shi".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_shi();
   }

   if("ca".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ca();
   }

   if("es_GT".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_GT();
   }

   if("lkt".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lkt();
   }

   if("sr".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sr();
   }

   if("es_PY".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_PY();
   }

   if("yo_BJ".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_yo_BJ();
   }

   if("gv".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_gv();
   }

   if("mn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_mn();
   }

   if("lo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lo();
   }

   if("sv".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_sv();
   }

   if("hu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_hu();
   }

   if("is".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_is();
   }

   if("bm".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bm();
   }

   if("el".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_el();
   }

   if("shi_Latn".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_shi_Latn();
   }

   if("nl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_nl();
   }

   if("rof".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_rof();
   }

   if("wae".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_wae();
   }

   if("zh_Hans_HK".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_zh_Hans_HK();
   }

   if("uz_Cyrl".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_uz_Cyrl();
   }

   if("se".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_se();
   }

   if("qu".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_qu();
   }

   if("km".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_km();
   }

   if("fur".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fur();
   }

   if("ee".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ee();
   }

   if("kde".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_kde();
   }

   if("pa_Arab".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_pa_Arab();
   }

   if("bn_IN".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_bn_IN();
   }

   if("es_CR".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_CR();
   }

   if("xh".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_xh();
   }

   if("fil".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_fil();
   }

   if("so".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_so();
   }

   if("tg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_tg();
   }

   if("prg".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_prg();
   }

   if("rw".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_rw();
   }

   if("lb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_lb();
   }

   if("es_PE".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_es_PE();
   }

   if("vun".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_vun();
   }

   if("eo".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_eo();
   }

   if("jmc".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_jmc();
   }

   if("ckb".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ckb();
   }

   if("ha".equals(System.getProperty("locale"))){
     return new LocalizedNamesImpl_ha();
   }
   */
     return new DefaultLocalizedNames();
 }
}
