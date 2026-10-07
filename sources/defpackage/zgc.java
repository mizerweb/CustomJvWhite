package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class zgc {
    public static final String A = "custom_ica";
    public static final String B = "face";
    public static final String C = "ica";
    public static final String D = "ocr";
    public static final String E = "langid";
    public static final String F = "nlclassifier";
    public static final String G = "tflite_dynamite";
    public static final String H = "barcode_ui";
    public static final String I = "smart_reply";
    public static final do6 J;
    public static final do6 K;
    public static final do6 L;
    public static final do6 M;
    public static final do6 N;
    public static final do6 O;
    public static final do6 P;
    public static final do6 Q;
    public static final do6 R;
    public static final do6 S;
    public static final do6 T;
    public static final do6 U;
    public static final do6 V;
    public static final do6 W;
    public static final do6 X;
    public static final do6 Y;
    public static final do6 Z;
    public static final do6[] a = new do6[0];
    public static final do6 a0;
    public static final String b = "com.google.android.gms.vision.dynamite";
    public static final do6 b0;
    public static final String c = "com.google.android.gms.vision.barcode";
    public static final do6 c0;
    public static final String d = "com.google.android.gms.vision.custom.ica";
    public static final do6 d0;
    public static final String e = "com.google.android.gms.vision.face";
    public static final do6 e0;
    public static final String f = "com.google.android.gms.vision.ica";
    public static final do6 f0;
    public static final String g = "com.google.android.gms.vision.ocr";
    public static final do6 g0;
    public static final String h = "com.google.android.gms.mlkit_ocr_chinese";
    public static final do6 h0;
    public static final String i = "com.google.android.gms.mlkit_ocr_common";
    private static final ynk i0;
    public static final String j = "com.google.android.gms.mlkit_ocr_devanagari";
    private static final ynk j0;
    public static final String k = "com.google.android.gms.mlkit_ocr_japanese";
    public static final String l = "com.google.android.gms.mlkit_ocr_korean";
    public static final String m = "com.google.android.gms.mlkit.langid";
    public static final String n = "com.google.android.gms.mlkit.nlclassifier";
    public static final String o = "com.google.android.gms.tflite_dynamite";
    public static final String p = "com.google.android.gms.mlkit_smartreply";
    public static final String q = "com.google.android.gms.mlkit_image_caption";
    public static final String r = "com.google.android.gms.mlkit_quality_aesthetic";
    public static final String s = "com.google.android.gms.mlkit_quality_technical";
    public static final String t = "com.google.android.gms.mlkit_docscan_detect";
    public static final String u = "com.google.android.gms.mlkit_docscan_crop";
    public static final String v = "com.google.android.gms.mlkit_docscan_enhance";
    public static final String w = "com.google.android.gms.mlkit_docscan_shadow";
    public static final String x = "com.google.android.gms.mlkit_docscan_stain";
    public static final String y = "com.google.android.gms.mlkit_subject_segmentation";
    public static final String z = "barcode";

    static {
        do6 do6Var = new do6("vision.barcode", 1L);
        J = do6Var;
        do6 do6Var2 = new do6("vision.custom.ica", 1L);
        K = do6Var2;
        do6 do6Var3 = new do6("vision.face", 1L);
        L = do6Var3;
        do6 do6Var4 = new do6("vision.ica", 1L);
        M = do6Var4;
        do6 do6Var5 = new do6("vision.ocr", 1L);
        N = do6Var5;
        O = new do6("mlkit.ocr.chinese", 1L);
        P = new do6("mlkit.ocr.common", 1L);
        Q = new do6("mlkit.ocr.devanagari", 1L);
        R = new do6("mlkit.ocr.japanese", 1L);
        S = new do6("mlkit.ocr.korean", 1L);
        do6 do6Var6 = new do6("mlkit.langid", 1L);
        T = do6Var6;
        do6 do6Var7 = new do6("mlkit.nlclassifier", 1L);
        U = do6Var7;
        do6 do6Var8 = new do6(G, 1L);
        V = do6Var8;
        do6 do6Var9 = new do6("mlkit.barcode.ui", 1L);
        W = do6Var9;
        do6 do6Var10 = new do6("mlkit.smartreply", 1L);
        X = do6Var10;
        Y = new do6("mlkit.image.caption", 1L);
        Z = new do6("mlkit.docscan.detect", 1L);
        a0 = new do6("mlkit.docscan.crop", 1L);
        b0 = new do6("mlkit.docscan.enhance", 1L);
        c0 = new do6("mlkit.docscan.ui", 1L);
        d0 = new do6("mlkit.docscan.stain", 1L);
        e0 = new do6("mlkit.docscan.shadow", 1L);
        f0 = new do6("mlkit.quality.aesthetic", 1L);
        g0 = new do6("mlkit.quality.technical", 1L);
        h0 = new do6("mlkit.segmentation.subject", 1L);
        ed7 ed7Var = new ed7(21);
        ed7Var.Y(z, do6Var);
        ed7Var.Y(A, do6Var2);
        ed7Var.Y(B, do6Var3);
        ed7Var.Y(C, do6Var4);
        ed7Var.Y(D, do6Var5);
        ed7Var.Y(E, do6Var6);
        ed7Var.Y(F, do6Var7);
        ed7Var.Y(G, do6Var8);
        ed7Var.Y(H, do6Var9);
        ed7Var.Y(I, do6Var10);
        onk onkVar = (onk) ed7Var.d;
        if (onkVar != null) {
            throw onkVar.a();
        }
        xok xokVarA = xok.a(ed7Var.b, (Object[]) ed7Var.c, ed7Var);
        onk onkVar2 = (onk) ed7Var.d;
        if (onkVar2 != null) {
            throw onkVar2.a();
        }
        i0 = xokVarA;
        ed7 ed7Var2 = new ed7(21);
        ed7Var2.Y(c, do6Var);
        ed7Var2.Y(d, do6Var2);
        ed7Var2.Y(e, do6Var3);
        ed7Var2.Y(f, do6Var4);
        ed7Var2.Y(g, do6Var5);
        ed7Var2.Y(m, do6Var6);
        ed7Var2.Y(n, do6Var7);
        ed7Var2.Y(o, do6Var8);
        ed7Var2.Y(p, do6Var10);
        onk onkVar3 = (onk) ed7Var2.d;
        if (onkVar3 != null) {
            throw onkVar3.a();
        }
        xok xokVarA2 = xok.a(ed7Var2.b, (Object[]) ed7Var2.c, ed7Var2);
        onk onkVar4 = (onk) ed7Var2.d;
        if (onkVar4 != null) {
            throw onkVar4.a();
        }
        j0 = xokVarA2;
    }

    private zgc() {
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) {
        go7.b.getClass();
        if (go7.a(context) >= 221500000) {
            return b(context, f(j0, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                rx5.c(context, rx5.b, it.next());
            }
            return true;
        } catch (DynamiteModule$LoadingException unused) {
            return false;
        }
    }

    public static boolean b(Context context, final do6[] do6VarArr) {
        try {
            kam kamVarC = new dmk(context, dmk.k, eo.L, do7.c).c(new ygc() { // from class: a1m
                @Override // defpackage.ygc
                public final do6[] s() {
                    do6[] do6VarArr2 = zgc.a;
                    return do6VarArr;
                }
            });
            ttb ttbVar = new ttb() { // from class: k3m
                @Override // defpackage.ttb
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            };
            kamVarC.getClass();
            kamVarC.d(vjh.a, ttbVar);
            return ((a1b) gwl.a(kamVarC)).a;
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e2);
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        bnk bnkVar = jnk.b;
        Object[] objArr = {str};
        n1g.l0(objArr, 1);
        d(context, jnk.g(objArr, 1));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        go7.b.getClass();
        if (go7.a(context) >= 221500000) {
            e(context, f(i0, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final do6[] do6VarArr) {
        kam kamVarB;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ygc() { // from class: nwl
            @Override // defpackage.ygc
            public final do6[] s() {
                do6[] do6VarArr2 = zgc.a;
                return do6VarArr;
            }
        });
        yab.n("APIs must not be empty.", !arrayList.isEmpty());
        dmk dmkVar = new dmk(context, dmk.k, eo.L, do7.c);
        hp hpVarB = hp.b(arrayList, true);
        if (hpVarB.a.isEmpty()) {
            kamVarB = gwl.e(new c1b(0, false));
        } else {
            dc5 dc5Var = new dc5();
            dc5Var.d = new do6[]{tqk.a};
            dc5Var.a = true;
            dc5Var.b = 27304;
            dc5Var.c = new n6k(dmkVar, hpVarB);
            kamVarB = dmkVar.b(0, dc5Var.a());
        }
        kamVarB.k(new ttb() { // from class: zyl
            @Override // defpackage.ttb
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static do6[] f(Map map, List list) {
        do6[] do6VarArr = new do6[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            do6 do6Var = (do6) map.get(list.get(i2));
            yab.s(do6Var);
            do6VarArr[i2] = do6Var;
        }
        return do6VarArr;
    }
}
