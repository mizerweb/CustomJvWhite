package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ef0 {
    private ef0() {
    }

    public static String[] a(Context context, vb9 vb9Var, boolean z) throws IOException {
        String strA;
        String string;
        if (z) {
            strA = vb9Var.b();
            yab.s(strA);
        } else {
            strA = vb9Var.a();
            yab.s(strA);
        }
        if (vb9Var.d()) {
            v0b.a aVarC = v0b.c(strA, z, context);
            if (aVarC == null) {
                qr7.k("Failed to parse manifest file.");
                return null;
            }
            if (!mf4.d.equals(aVarC.c())) {
                ore.k("Model type should be: IMAGE_LABELING.");
                return null;
            }
            strA = new File(new File(strA).getParent(), aVarC.b()).toString();
            string = new File(new File(strA).getParent(), aVarC.a()).toString();
        } else {
            string = "";
        }
        return new String[]{strA, string};
    }

    public static List<String> b(Context context, String str, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamOpen = z ? context.getAssets().open(str) : new FileInputStream(new File(str));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                arrayList.add(line);
            }
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
