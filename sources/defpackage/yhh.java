package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class yhh extends sq0 implements Serializable {
    public final String b;
    public final String c;
    public final String d;

    public yhh(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.sq0
    public String toString() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{error='");
        sb.append(this.b);
        sb.append("', message='");
        sb.append(this.c);
        return qt4.q(sb, "', localizedMessage='", this.d, "'}");
    }
}
