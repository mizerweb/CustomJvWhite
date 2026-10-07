package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class bt2 extends gt2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public bt2(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.gt2
    public final boolean c(char c) {
        switch (this.a) {
            case 0:
                return Arrays.binarySearch((char[]) this.b, c) >= 0;
            default:
                return !((gt2) this.b).c(c);
        }
    }

    @Override // defpackage.gt2
    public gt2 d() {
        switch (this.a) {
            case 1:
                return (gt2) this.b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(gt2.a(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((gt2) obj) + ".negate()";
        }
    }

    public bt2(gt2 gt2Var) {
        gt2Var.getClass();
        this.b = gt2Var;
    }
}
