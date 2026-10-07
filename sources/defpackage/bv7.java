package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bv7 {
    public static final bv7 d = new bv7();
    public final boolean a = true;
    public final boolean b = true;
    public final boolean c;

    public bv7() {
        boolean z = true;
        if (!qyj.b("  ") && !qyj.b("") && !qyj.b("") && !qyj.b("")) {
            z = false;
        }
        this.c = z;
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        nbh.G(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
