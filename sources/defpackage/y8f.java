package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y8f implements k79 {
    public final int a;
    public final List b;

    public y8f(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public abstract boolean i(y8f y8fVar);

    public abstract boolean o(y8f y8fVar);

    public String q() {
        return null;
    }

    public final String r() {
        String str;
        long itemId = getItemId();
        StringBuilder sb = new StringBuilder();
        sb.append(itemId);
        sb.append("/");
        switch (this.a) {
            case 1:
                str = "CHAT";
                break;
            case 2:
                str = "GLOBAL_CHAT";
                break;
            case 3:
                str = "CONTACT";
                break;
            case 4:
                str = "GLOBAL_CONTACT";
                break;
            case 5:
                str = "MESSAGE";
                break;
            case 6:
                str = "SHOW_MORE_PUBLIC";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public String toString() {
        return c0a.o("SearchModel(", r(), ")");
    }
}
