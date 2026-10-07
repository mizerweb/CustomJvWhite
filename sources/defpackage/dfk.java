package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dfk {
    public final String a;
    public String b = null;
    public final ArrayList c = new ArrayList(7);
    public final ArrayList d = new ArrayList();

    public dfk(String str) {
        this.a = str;
    }

    public final void a(StringBuilder sb) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append((String) obj);
            sb.append("\r\n");
        }
    }
}
