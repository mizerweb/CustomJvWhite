package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bql {
    public static a35 a(ble bleVar, String str, l4e l4eVar, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri uriE = w1m.e(str, l4eVar.c);
        long j = l4eVar.a;
        long j2 = l4eVar.b;
        String strC = c(bleVar, l4eVar);
        lvb.W(uriE, "The uri must be set.");
        return new a35(uriE, 0L, 1, null, lhe.g, j, j2, strC, i, null);
    }

    public static void b(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static String c(ble bleVar, l4e l4eVar) {
        String strA = bleVar.a();
        return strA != null ? strA : w1m.e(((ws0) bleVar.b.get(0)).a, l4eVar.c).toString();
    }
}
