package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv7 {
    public static final cv7 b = new cv7();
    public final boolean a = true;

    public cv7() {
        if (qyj.b("")) {
            return;
        }
        qyj.b("");
    }

    public final void a(StringBuilder sb, String str) {
        nbh.G(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
