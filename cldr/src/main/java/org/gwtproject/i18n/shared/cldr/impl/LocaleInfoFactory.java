package org.gwtproject.i18n.shared.cldr.impl;

import javax.annotation.Generated;

import jsinterop.annotations.JsMethod;

@Generated("gwt-cldr-importer : org.gwtproject.tools.cldr.LocalesNativeNamesProcessor, CLDR version : release-34")
public class LocaleInfoFactory {

  @JsMethod
  public static native org.gwtproject.i18n.shared.cldr.LocaleInfoImpl create();

/*  public static LocaleInfoImpl create() {
    if(System.getProperty("locale").equals("default")) {
      return new LocaleInfoImpl();
    }
    if(System.getProperty("locale").startsWith("zu")) {
      return new LocaleInfoImpl_zu();
    }*/

    /*
    if(System.getProperty("locale").startsWith("zh_Hant_TW")) {
      return new LocaleInfoImpl_zh_Hant_TW();
    }
    if(System.getProperty("locale").startsWith("zh_Hant_MO")) {
      return new LocaleInfoImpl_zh_Hant_MO();
    }
    if(System.getProperty("locale").startsWith("zh_Hant_HK")) {
      return new LocaleInfoImpl_zh_Hant_HK();
    }
    if(System.getProperty("locale").startsWith("zh_Hant")) {
      return new LocaleInfoImpl_zh_Hant();
    }
    if(System.getProperty("locale").startsWith("zh_Hans_HK")) {
      return new LocaleInfoImpl_zh_Hans_HK();
    }
    if(System.getProperty("locale").startsWith("zh")) {
      return new LocaleInfoImpl_zh();
    }
    if(System.getProperty("locale").startsWith("zgh")) {
      return new LocaleInfoImpl_zgh();
    }
    if(System.getProperty("locale").startsWith("yue_Hans")) {
      return new LocaleInfoImpl_yue_Hans();
    }
    if(System.getProperty("locale").startsWith("yue")) {
      return new LocaleInfoImpl_yue();
    }
    if(System.getProperty("locale").startsWith("yo_BJ")) {
      return new LocaleInfoImpl_yo_BJ();
    }
    if(System.getProperty("locale").startsWith("yo")) {
      return new LocaleInfoImpl_yo();
    }
    if(System.getProperty("locale").startsWith("yi")) {
      return new LocaleInfoImpl_yi();
    }
    if(System.getProperty("locale").startsWith("yav")) {
      return new LocaleInfoImpl_yav();
    }
    if(System.getProperty("locale").startsWith("xog")) {
      return new LocaleInfoImpl_xog();
    }
    if(System.getProperty("locale").startsWith("xh")) {
      return new LocaleInfoImpl_xh();
    }
    if(System.getProperty("locale").startsWith("wo")) {
      return new LocaleInfoImpl_wo();
    }
    if(System.getProperty("locale").startsWith("wae")) {
      return new LocaleInfoImpl_wae();
    }
    if(System.getProperty("locale").startsWith("vun")) {
      return new LocaleInfoImpl_vun();
    }
    if(System.getProperty("locale").startsWith("vo")) {
      return new LocaleInfoImpl_vo();
    }
    if(System.getProperty("locale").startsWith("vi")) {
      return new LocaleInfoImpl_vi();
    }
    if(System.getProperty("locale").startsWith("vai_Latn")) {
      return new LocaleInfoImpl_vai_Latn();
    }
    if(System.getProperty("locale").startsWith("vai")) {
      return new LocaleInfoImpl_vai();
    }
    if(System.getProperty("locale").startsWith("uz_Cyrl")) {
      return new LocaleInfoImpl_uz_Cyrl();
    }
    if(System.getProperty("locale").startsWith("uz_Arab")) {
      return new LocaleInfoImpl_uz_Arab();
    }
    if(System.getProperty("locale").startsWith("uz")) {
      return new LocaleInfoImpl_uz();
    }
    if(System.getProperty("locale").startsWith("ur_IN")) {
      return new LocaleInfoImpl_ur_IN();
    }
    if(System.getProperty("locale").startsWith("ur")) {
      return new LocaleInfoImpl_ur();
    }
    if(System.getProperty("locale").startsWith("uk")) {
      return new LocaleInfoImpl_uk();
    }
    if(System.getProperty("locale").startsWith("ug")) {
      return new LocaleInfoImpl_ug();
    }
    if(System.getProperty("locale").startsWith("tzm")) {
      return new LocaleInfoImpl_tzm();
    }
    if(System.getProperty("locale").startsWith("twq")) {
      return new LocaleInfoImpl_twq();
    }
    if(System.getProperty("locale").startsWith("tt")) {
      return new LocaleInfoImpl_tt();
    }
    if(System.getProperty("locale").startsWith("tr")) {
      return new LocaleInfoImpl_tr();
    }
    if(System.getProperty("locale").startsWith("to")) {
      return new LocaleInfoImpl_to();
    }
    if(System.getProperty("locale").startsWith("tk")) {
      return new LocaleInfoImpl_tk();
    }
    if(System.getProperty("locale").startsWith("ti")) {
      return new LocaleInfoImpl_ti();
    }
    if(System.getProperty("locale").startsWith("th")) {
      return new LocaleInfoImpl_th();
    }
    if(System.getProperty("locale").startsWith("tg")) {
      return new LocaleInfoImpl_tg();
    }
    if(System.getProperty("locale").startsWith("teo")) {
      return new LocaleInfoImpl_teo();
    }
    if(System.getProperty("locale").startsWith("te")) {
      return new LocaleInfoImpl_te();
    }
    if(System.getProperty("locale").startsWith("ta")) {
      return new LocaleInfoImpl_ta();
    }
    if(System.getProperty("locale").startsWith("sw_KE")) {
      return new LocaleInfoImpl_sw_KE();
    }
    if(System.getProperty("locale").startsWith("sw_CD")) {
      return new LocaleInfoImpl_sw_CD();
    }
    if(System.getProperty("locale").startsWith("sw")) {
      return new LocaleInfoImpl_sw();
    }
    if(System.getProperty("locale").startsWith("sv")) {
      return new LocaleInfoImpl_sv();
    }
    if(System.getProperty("locale").startsWith("sr_Latn_XK")) {
      return new LocaleInfoImpl_sr_Latn_XK();
    }
    if(System.getProperty("locale").startsWith("sr_Latn_ME")) {
      return new LocaleInfoImpl_sr_Latn_ME();
    }
    if(System.getProperty("locale").startsWith("sr_Latn_BA")) {
      return new LocaleInfoImpl_sr_Latn_BA();
    }
    if(System.getProperty("locale").startsWith("sr_Latn")) {
      return new LocaleInfoImpl_sr_Latn();
    }
    if(System.getProperty("locale").startsWith("sr_Cyrl_XK")) {
      return new LocaleInfoImpl_sr_Cyrl_XK();
    }
    if(System.getProperty("locale").startsWith("sr_Cyrl_ME")) {
      return new LocaleInfoImpl_sr_Cyrl_ME();
    }
    if(System.getProperty("locale").startsWith("sr_Cyrl_BA")) {
      return new LocaleInfoImpl_sr_Cyrl_BA();
    }
    if(System.getProperty("locale").startsWith("sr")) {
      return new LocaleInfoImpl_sr();
    }
    if(System.getProperty("locale").startsWith("sq")) {
      return new LocaleInfoImpl_sq();
    }
    if(System.getProperty("locale").startsWith("so")) {
      return new LocaleInfoImpl_so();
    }
    if(System.getProperty("locale").startsWith("sn")) {
      return new LocaleInfoImpl_sn();
    }
    if(System.getProperty("locale").startsWith("smn")) {
      return new LocaleInfoImpl_smn();
    }
    if(System.getProperty("locale").startsWith("sl")) {
      return new LocaleInfoImpl_sl();
    }
    if(System.getProperty("locale").startsWith("sk")) {
      return new LocaleInfoImpl_sk();
    }
    if(System.getProperty("locale").startsWith("si")) {
      return new LocaleInfoImpl_si();
    }
    if(System.getProperty("locale").startsWith("shi_Latn")) {
      return new LocaleInfoImpl_shi_Latn();
    }
    if(System.getProperty("locale").startsWith("shi")) {
      return new LocaleInfoImpl_shi();
    }
    if(System.getProperty("locale").startsWith("sg")) {
      return new LocaleInfoImpl_sg();
    }
    if(System.getProperty("locale").startsWith("ses")) {
      return new LocaleInfoImpl_ses();
    }
    if(System.getProperty("locale").startsWith("seh")) {
      return new LocaleInfoImpl_seh();
    }
    if(System.getProperty("locale").startsWith("se_FI")) {
      return new LocaleInfoImpl_se_FI();
    }
    if(System.getProperty("locale").startsWith("se")) {
      return new LocaleInfoImpl_se();
    }
    if(System.getProperty("locale").startsWith("sd")) {
      return new LocaleInfoImpl_sd();
    }
    if(System.getProperty("locale").startsWith("sbp")) {
      return new LocaleInfoImpl_sbp();
    }
    if(System.getProperty("locale").startsWith("saq")) {
      return new LocaleInfoImpl_saq();
    }
    if(System.getProperty("locale").startsWith("sah")) {
      return new LocaleInfoImpl_sah();
    }
    if(System.getProperty("locale").startsWith("rwk")) {
      return new LocaleInfoImpl_rwk();
    }
    if(System.getProperty("locale").startsWith("rw")) {
      return new LocaleInfoImpl_rw();
    }
    if(System.getProperty("locale").startsWith("ru_UA")) {
      return new LocaleInfoImpl_ru_UA();
    }
    if(System.getProperty("locale").startsWith("ru")) {
      return new LocaleInfoImpl_ru();
    }
    if(System.getProperty("locale").startsWith("rof")) {
      return new LocaleInfoImpl_rof();
    }
    if(System.getProperty("locale").startsWith("ro_MD")) {
      return new LocaleInfoImpl_ro_MD();
    }
    if(System.getProperty("locale").startsWith("ro")) {
      return new LocaleInfoImpl_ro();
    }
    if(System.getProperty("locale").startsWith("rn")) {
      return new LocaleInfoImpl_rn();
    }
    if(System.getProperty("locale").startsWith("rm")) {
      return new LocaleInfoImpl_rm();
    }
    if(System.getProperty("locale").startsWith("qu")) {
      return new LocaleInfoImpl_qu();
    }
    if(System.getProperty("locale").startsWith("pt_TL")) {
      return new LocaleInfoImpl_pt_TL();
    }
    if(System.getProperty("locale").startsWith("pt_ST")) {
      return new LocaleInfoImpl_pt_ST();
    }
    if(System.getProperty("locale").startsWith("pt_PT")) {
      return new LocaleInfoImpl_pt_PT();
    }
    if(System.getProperty("locale").startsWith("pt_MZ")) {
      return new LocaleInfoImpl_pt_MZ();
    }
    if(System.getProperty("locale").startsWith("pt_MO")) {
      return new LocaleInfoImpl_pt_MO();
    }
    if(System.getProperty("locale").startsWith("pt_LU")) {
      return new LocaleInfoImpl_pt_LU();
    }
    if(System.getProperty("locale").startsWith("pt_GW")) {
      return new LocaleInfoImpl_pt_GW();
    }
    if(System.getProperty("locale").startsWith("pt_GQ")) {
      return new LocaleInfoImpl_pt_GQ();
    }
    if(System.getProperty("locale").startsWith("pt_CV")) {
      return new LocaleInfoImpl_pt_CV();
    }
    if(System.getProperty("locale").startsWith("pt_CH")) {
      return new LocaleInfoImpl_pt_CH();
    }
    if(System.getProperty("locale").startsWith("pt_AO")) {
      return new LocaleInfoImpl_pt_AO();
    }
    if(System.getProperty("locale").startsWith("pt")) {
      return new LocaleInfoImpl_pt();
    }
    if(System.getProperty("locale").startsWith("ps")) {
      return new LocaleInfoImpl_ps();
    }
    if(System.getProperty("locale").startsWith("prg")) {
      return new LocaleInfoImpl_prg();
    }
    if(System.getProperty("locale").startsWith("pl")) {
      return new LocaleInfoImpl_pl();
    }
    if(System.getProperty("locale").startsWith("pa_Arab")) {
      return new LocaleInfoImpl_pa_Arab();
    }
    if(System.getProperty("locale").startsWith("pa")) {
      return new LocaleInfoImpl_pa();
    }
    if(System.getProperty("locale").startsWith("os")) {
      return new LocaleInfoImpl_os();
    }
    if(System.getProperty("locale").startsWith("or")) {
      return new LocaleInfoImpl_or();
    }
    if(System.getProperty("locale").startsWith("om")) {
      return new LocaleInfoImpl_om();
    }
    if(System.getProperty("locale").startsWith("nyn")) {
      return new LocaleInfoImpl_nyn();
    }
    if(System.getProperty("locale").startsWith("nus")) {
      return new LocaleInfoImpl_nus();
    }
    if(System.getProperty("locale").startsWith("nnh")) {
      return new LocaleInfoImpl_nnh();
    }
    if(System.getProperty("locale").startsWith("nn")) {
      return new LocaleInfoImpl_nn();
    }
    if(System.getProperty("locale").startsWith("nmg")) {
      return new LocaleInfoImpl_nmg();
    }
    if(System.getProperty("locale").startsWith("nl_BE")) {
      return new LocaleInfoImpl_nl_BE();
    }
    if(System.getProperty("locale").startsWith("nl")) {
      return new LocaleInfoImpl_nl();
    }
    if(System.getProperty("locale").startsWith("ne")) {
      return new LocaleInfoImpl_ne();
    }
    if(System.getProperty("locale").startsWith("nds")) {
      return new LocaleInfoImpl_nds();
    }
    if(System.getProperty("locale").startsWith("nd")) {
      return new LocaleInfoImpl_nd();
    }
    if(System.getProperty("locale").startsWith("nb")) {
      return new LocaleInfoImpl_nb();
    }
    if(System.getProperty("locale").startsWith("naq")) {
      return new LocaleInfoImpl_naq();
    }
    if(System.getProperty("locale").startsWith("mzn")) {
      return new LocaleInfoImpl_mzn();
    }
    if(System.getProperty("locale").startsWith("my")) {
      return new LocaleInfoImpl_my();
    }
    if(System.getProperty("locale").startsWith("mua")) {
      return new LocaleInfoImpl_mua();
    }
    if(System.getProperty("locale").startsWith("mt")) {
      return new LocaleInfoImpl_mt();
    }
    if(System.getProperty("locale").startsWith("ms")) {
      return new LocaleInfoImpl_ms();
    }
    if(System.getProperty("locale").startsWith("mr")) {
      return new LocaleInfoImpl_mr();
    }
    if(System.getProperty("locale").startsWith("mn")) {
      return new LocaleInfoImpl_mn();
    }
    if(System.getProperty("locale").startsWith("ml")) {
      return new LocaleInfoImpl_ml();
    }
    if(System.getProperty("locale").startsWith("mk")) {
      return new LocaleInfoImpl_mk();
    }
    if(System.getProperty("locale").startsWith("mi")) {
      return new LocaleInfoImpl_mi();
    }
    if(System.getProperty("locale").startsWith("mgo")) {
      return new LocaleInfoImpl_mgo();
    }
    if(System.getProperty("locale").startsWith("mgh")) {
      return new LocaleInfoImpl_mgh();
    }
    if(System.getProperty("locale").startsWith("mg")) {
      return new LocaleInfoImpl_mg();
    }
    if(System.getProperty("locale").startsWith("mfe")) {
      return new LocaleInfoImpl_mfe();
    }
    if(System.getProperty("locale").startsWith("mer")) {
      return new LocaleInfoImpl_mer();
    }
    if(System.getProperty("locale").startsWith("mas")) {
      return new LocaleInfoImpl_mas();
    }
    if(System.getProperty("locale").startsWith("lv")) {
      return new LocaleInfoImpl_lv();
    }
    if(System.getProperty("locale").startsWith("luy")) {
      return new LocaleInfoImpl_luy();
    }
    if(System.getProperty("locale").startsWith("luo")) {
      return new LocaleInfoImpl_luo();
    }
    if(System.getProperty("locale").startsWith("lu")) {
      return new LocaleInfoImpl_lu();
    }
    if(System.getProperty("locale").startsWith("lt")) {
      return new LocaleInfoImpl_lt();
    }
    if(System.getProperty("locale").startsWith("lrc")) {
      return new LocaleInfoImpl_lrc();
    }
    if(System.getProperty("locale").startsWith("lo")) {
      return new LocaleInfoImpl_lo();
    }
    if(System.getProperty("locale").startsWith("ln")) {
      return new LocaleInfoImpl_ln();
    }
    if(System.getProperty("locale").startsWith("lkt")) {
      return new LocaleInfoImpl_lkt();
    }
    if(System.getProperty("locale").startsWith("lg")) {
      return new LocaleInfoImpl_lg();
    }
    if(System.getProperty("locale").startsWith("lb")) {
      return new LocaleInfoImpl_lb();
    }
    if(System.getProperty("locale").startsWith("lag")) {
      return new LocaleInfoImpl_lag();
    }
    if(System.getProperty("locale").startsWith("ky")) {
      return new LocaleInfoImpl_ky();
    }
    if(System.getProperty("locale").startsWith("kw")) {
      return new LocaleInfoImpl_kw();
    }
    if(System.getProperty("locale").startsWith("ku")) {
      return new LocaleInfoImpl_ku();
    }
    if(System.getProperty("locale").startsWith("ksh")) {
      return new LocaleInfoImpl_ksh();
    }
    if(System.getProperty("locale").startsWith("ksf")) {
      return new LocaleInfoImpl_ksf();
    }
    if(System.getProperty("locale").startsWith("ksb")) {
      return new LocaleInfoImpl_ksb();
    }
    if(System.getProperty("locale").startsWith("ks")) {
      return new LocaleInfoImpl_ks();
    }
    if(System.getProperty("locale").startsWith("kok")) {
      return new LocaleInfoImpl_kok();
    }
    if(System.getProperty("locale").startsWith("ko_KP")) {
      return new LocaleInfoImpl_ko_KP();
    }
    if(System.getProperty("locale").startsWith("ko")) {
      return new LocaleInfoImpl_ko();
    }
    if(System.getProperty("locale").startsWith("kn")) {
      return new LocaleInfoImpl_kn();
    }
    if(System.getProperty("locale").startsWith("km")) {
      return new LocaleInfoImpl_km();
    }
    if(System.getProperty("locale").startsWith("kln")) {
      return new LocaleInfoImpl_kln();
    }
    if(System.getProperty("locale").startsWith("kl")) {
      return new LocaleInfoImpl_kl();
    }
    if(System.getProperty("locale").startsWith("kkj")) {
      return new LocaleInfoImpl_kkj();
    }
    if(System.getProperty("locale").startsWith("kk")) {
      return new LocaleInfoImpl_kk();
    }
    if(System.getProperty("locale").startsWith("ki")) {
      return new LocaleInfoImpl_ki();
    }
    if(System.getProperty("locale").startsWith("khq")) {
      return new LocaleInfoImpl_khq();
    }
    if(System.getProperty("locale").startsWith("kea")) {
      return new LocaleInfoImpl_kea();
    }
    if(System.getProperty("locale").startsWith("kde")) {
      return new LocaleInfoImpl_kde();
    }
    if(System.getProperty("locale").startsWith("kam")) {
      return new LocaleInfoImpl_kam();
    }
    if(System.getProperty("locale").startsWith("kab")) {
      return new LocaleInfoImpl_kab();
    }
    if(System.getProperty("locale").startsWith("ka")) {
      return new LocaleInfoImpl_ka();
    }
    if(System.getProperty("locale").startsWith("jv")) {
      return new LocaleInfoImpl_jv();
    }
    if(System.getProperty("locale").startsWith("jmc")) {
      return new LocaleInfoImpl_jmc();
    }
    if(System.getProperty("locale").startsWith("jgo")) {
      return new LocaleInfoImpl_jgo();
    }
    if(System.getProperty("locale").startsWith("ja")) {
      return new LocaleInfoImpl_ja();
    }
    if(System.getProperty("locale").startsWith("it")) {
      return new LocaleInfoImpl_it();
    }
    if(System.getProperty("locale").startsWith("is")) {
      return new LocaleInfoImpl_is();
    }
    if(System.getProperty("locale").startsWith("ii")) {
      return new LocaleInfoImpl_ii();
    }
    if(System.getProperty("locale").startsWith("ig")) {
      return new LocaleInfoImpl_ig();
    }
    if(System.getProperty("locale").startsWith("id")) {
      return new LocaleInfoImpl_id();
    }
    if(System.getProperty("locale").startsWith("ia")) {
      return new LocaleInfoImpl_ia();
    }
    if(System.getProperty("locale").startsWith("hy")) {
      return new LocaleInfoImpl_hy();
    }
    if(System.getProperty("locale").startsWith("hu")) {
      return new LocaleInfoImpl_hu();
    }
    if(System.getProperty("locale").startsWith("hsb")) {
      return new LocaleInfoImpl_hsb();
    }
    if(System.getProperty("locale").startsWith("hr")) {
      return new LocaleInfoImpl_hr();
    }
    if(System.getProperty("locale").startsWith("hi")) {
      return new LocaleInfoImpl_hi();
    }
    if(System.getProperty("locale").startsWith("he")) {
      return new LocaleInfoImpl_he();
    }
    if(System.getProperty("locale").startsWith("haw")) {
      return new LocaleInfoImpl_haw();
    }
    if(System.getProperty("locale").startsWith("ha")) {
      return new LocaleInfoImpl_ha();
    }
    if(System.getProperty("locale").startsWith("gv")) {
      return new LocaleInfoImpl_gv();
    }
    if(System.getProperty("locale").startsWith("guz")) {
      return new LocaleInfoImpl_guz();
    }
    if(System.getProperty("locale").startsWith("gu")) {
      return new LocaleInfoImpl_gu();
    }
    if(System.getProperty("locale").startsWith("gsw")) {
      return new LocaleInfoImpl_gsw();
    }
    if(System.getProperty("locale").startsWith("gl")) {
      return new LocaleInfoImpl_gl();
    }
    if(System.getProperty("locale").startsWith("gd")) {
      return new LocaleInfoImpl_gd();
    }
    if(System.getProperty("locale").startsWith("ga")) {
      return new LocaleInfoImpl_ga();
    }
    if(System.getProperty("locale").startsWith("fy")) {
      return new LocaleInfoImpl_fy();
    }
    if(System.getProperty("locale").startsWith("fur")) {
      return new LocaleInfoImpl_fur();
    }
    if(System.getProperty("locale").startsWith("fr_CA")) {
      return new LocaleInfoImpl_fr_CA();
    }
    if(System.getProperty("locale").startsWith("fr_BE")) {
      return new LocaleInfoImpl_fr_BE();
    }
    if(System.getProperty("locale").startsWith("fr")) {
      return new LocaleInfoImpl_fr();
    }
    if(System.getProperty("locale").startsWith("fo")) {
      return new LocaleInfoImpl_fo();
    }
    if(System.getProperty("locale").startsWith("fil")) {
      return new LocaleInfoImpl_fil();
    }
    if(System.getProperty("locale").startsWith("fi")) {
      return new LocaleInfoImpl_fi();
    }
    if(System.getProperty("locale").startsWith("ff")) {
      return new LocaleInfoImpl_ff();
    }
    if(System.getProperty("locale").startsWith("fa_AF")) {
      return new LocaleInfoImpl_fa_AF();
    }
    if(System.getProperty("locale").startsWith("fa")) {
      return new LocaleInfoImpl_fa();
    }
    if(System.getProperty("locale").startsWith("ewo")) {
      return new LocaleInfoImpl_ewo();
    }
    if(System.getProperty("locale").startsWith("eu")) {
      return new LocaleInfoImpl_eu();
    }
    if(System.getProperty("locale").startsWith("et")) {
      return new LocaleInfoImpl_et();
    }
    if(System.getProperty("locale").startsWith("es_VE")) {
      return new LocaleInfoImpl_es_VE();
    }
    if(System.getProperty("locale").startsWith("es_US")) {
      return new LocaleInfoImpl_es_US();
    }
    if(System.getProperty("locale").startsWith("es_SV")) {
      return new LocaleInfoImpl_es_SV();
    }
    if(System.getProperty("locale").startsWith("es_PY")) {
      return new LocaleInfoImpl_es_PY();
    }
    if(System.getProperty("locale").startsWith("es_PR")) {
      return new LocaleInfoImpl_es_PR();
    }
    if(System.getProperty("locale").startsWith("es_PE")) {
      return new LocaleInfoImpl_es_PE();
    }
    if(System.getProperty("locale").startsWith("es_PA")) {
      return new LocaleInfoImpl_es_PA();
    }
    if(System.getProperty("locale").startsWith("es_NI")) {
      return new LocaleInfoImpl_es_NI();
    }
    if(System.getProperty("locale").startsWith("es_MX")) {
      return new LocaleInfoImpl_es_MX();
    }
    if(System.getProperty("locale").startsWith("es_HN")) {
      return new LocaleInfoImpl_es_HN();
    }
    if(System.getProperty("locale").startsWith("es_GT")) {
      return new LocaleInfoImpl_es_GT();
    }
    if(System.getProperty("locale").startsWith("es_EC")) {
      return new LocaleInfoImpl_es_EC();
    }
    if(System.getProperty("locale").startsWith("es_DO")) {
      return new LocaleInfoImpl_es_DO();
    }
    if(System.getProperty("locale").startsWith("es_CR")) {
      return new LocaleInfoImpl_es_CR();
    }
    if(System.getProperty("locale").startsWith("es_CO")) {
      return new LocaleInfoImpl_es_CO();
    }
    if(System.getProperty("locale").startsWith("es_CL")) {
      return new LocaleInfoImpl_es_CL();
    }
    if(System.getProperty("locale").startsWith("es_BO")) {
      return new LocaleInfoImpl_es_BO();
    }
    if(System.getProperty("locale").startsWith("es_AR")) {
      return new LocaleInfoImpl_es_AR();
    }
    if(System.getProperty("locale").startsWith("es_419")) {
      return new LocaleInfoImpl_es_419();
    }
    if(System.getProperty("locale").startsWith("es")) {
      return new LocaleInfoImpl_es();
    }
    if(System.getProperty("locale").startsWith("eo")) {
      return new LocaleInfoImpl_eo();
    }
    if(System.getProperty("locale").startsWith("en_GB")) {
      return new LocaleInfoImpl_en_GB();
    }
    if(System.getProperty("locale").startsWith("en")) {
      return new LocaleInfoImpl_en();
    }
    if(System.getProperty("locale").startsWith("el")) {
      return new LocaleInfoImpl_el();
    }
    if(System.getProperty("locale").startsWith("ee")) {
      return new LocaleInfoImpl_ee();
    }
    if(System.getProperty("locale").startsWith("ebu")) {
      return new LocaleInfoImpl_ebu();
    }
    if(System.getProperty("locale").startsWith("dz")) {
      return new LocaleInfoImpl_dz();
    }
    if(System.getProperty("locale").startsWith("dyo")) {
      return new LocaleInfoImpl_dyo();
    }
    if(System.getProperty("locale").startsWith("dua")) {
      return new LocaleInfoImpl_dua();
    }
    if(System.getProperty("locale").startsWith("dsb")) {
      return new LocaleInfoImpl_dsb();
    }
    if(System.getProperty("locale").startsWith("dje")) {
      return new LocaleInfoImpl_dje();
    }
    if(System.getProperty("locale").startsWith("de_CH")) {
      return new LocaleInfoImpl_de_CH();
    }
    if(System.getProperty("locale").startsWith("de_AT")) {
      return new LocaleInfoImpl_de_AT();
    }
    if(System.getProperty("locale").startsWith("de")) {
      return new LocaleInfoImpl_de();
    }
    if(System.getProperty("locale").startsWith("dav")) {
      return new LocaleInfoImpl_dav();
    }
    if(System.getProperty("locale").startsWith("da")) {
      return new LocaleInfoImpl_da();
    }
    if(System.getProperty("locale").startsWith("cy")) {
      return new LocaleInfoImpl_cy();
    }
    if(System.getProperty("locale").startsWith("cu")) {
      return new LocaleInfoImpl_cu();
    }
    if(System.getProperty("locale").startsWith("cs")) {
      return new LocaleInfoImpl_cs();
    }
    if(System.getProperty("locale").startsWith("ckb")) {
      return new LocaleInfoImpl_ckb();
    }
    if(System.getProperty("locale").startsWith("chr")) {
      return new LocaleInfoImpl_chr();
    }
    if(System.getProperty("locale").startsWith("cgg")) {
      return new LocaleInfoImpl_cgg();
    }
    if(System.getProperty("locale").startsWith("ce")) {
      return new LocaleInfoImpl_ce();
    }
    if(System.getProperty("locale").startsWith("ccp")) {
      return new LocaleInfoImpl_ccp();
    }
    if(System.getProperty("locale").startsWith("ca")) {
      return new LocaleInfoImpl_ca();
    }
    if(System.getProperty("locale").startsWith("bs_Cyrl")) {
      return new LocaleInfoImpl_bs_Cyrl();
    }
    if(System.getProperty("locale").startsWith("bs")) {
      return new LocaleInfoImpl_bs();
    }
    if(System.getProperty("locale").startsWith("brx")) {
      return new LocaleInfoImpl_brx();
    }
    if(System.getProperty("locale").startsWith("br")) {
      return new LocaleInfoImpl_br();
    }
    if(System.getProperty("locale").startsWith("bo_IN")) {
      return new LocaleInfoImpl_bo_IN();
    }
    if(System.getProperty("locale").startsWith("bo")) {
      return new LocaleInfoImpl_bo();
    }
    if(System.getProperty("locale").startsWith("bn_IN")) {
      return new LocaleInfoImpl_bn_IN();
    }
    if(System.getProperty("locale").startsWith("bn")) {
      return new LocaleInfoImpl_bn();
    }
    if(System.getProperty("locale").startsWith("bm")) {
      return new LocaleInfoImpl_bm();
    }
    if(System.getProperty("locale").startsWith("bg")) {
      return new LocaleInfoImpl_bg();
    }
    if(System.getProperty("locale").startsWith("bez")) {
      return new LocaleInfoImpl_bez();
    }
    if(System.getProperty("locale").startsWith("bem")) {
      return new LocaleInfoImpl_bem();
    }
    if(System.getProperty("locale").startsWith("be")) {
      return new LocaleInfoImpl_be();
    }
    if(System.getProperty("locale").startsWith("bas")) {
      return new LocaleInfoImpl_bas();
    }
    if(System.getProperty("locale").startsWith("az_Cyrl")) {
      return new LocaleInfoImpl_az_Cyrl();
    }
    if(System.getProperty("locale").startsWith("az")) {
      return new LocaleInfoImpl_az();
    }
    if(System.getProperty("locale").startsWith("ast")) {
      return new LocaleInfoImpl_ast();
    }
    if(System.getProperty("locale").startsWith("asa")) {
      return new LocaleInfoImpl_asa();
    }
    if(System.getProperty("locale").startsWith("as")) {
      return new LocaleInfoImpl_as();
    }
    if(System.getProperty("locale").startsWith("ar_SA")) {
      return new LocaleInfoImpl_ar_SA();
    }
    if(System.getProperty("locale").startsWith("ar_LY")) {
      return new LocaleInfoImpl_ar_LY();
    }
    if(System.getProperty("locale").startsWith("ar")) {
      return new LocaleInfoImpl_ar();
    }
    if(System.getProperty("locale").startsWith("am")) {
      return new LocaleInfoImpl_am();
    }
    if(System.getProperty("locale").startsWith("ak")) {
      return new LocaleInfoImpl_ak();
    }
    if(System.getProperty("locale").startsWith("agq")) {
      return new LocaleInfoImpl_agq();
    }
    if(System.getProperty("locale").startsWith("af")) {
      return new LocaleInfoImpl_af();
    }


     */
/*    return new LocaleInfoImpl();
  }*/
}
