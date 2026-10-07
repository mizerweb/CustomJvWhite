package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zo4 {
    public final yo4 a;

    public zo4(yo4 yo4Var) {
        this.a = yo4Var;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final String toString() {
        return this.a.toString();
    }
}
