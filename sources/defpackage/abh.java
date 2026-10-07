package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class abh implements qxe {
    public final id7 a;

    public abh(id7 id7Var) {
        this.a = id7Var;
    }

    @Override // defpackage.qxe
    public final boolean G0() {
        return this.a.G0();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qxe
    public final vxe O0(String str) {
        int i;
        id7 id7Var = this.a;
        a8g a8gVar = null;
        if (!id7Var.isOpen()) {
            n1g.a0(21, "connection is closed");
            throw null;
        }
        String upperCase = r5h.y1(str).toString().toUpperCase(Locale.ROOT);
        int i2 = 2;
        int length = upperCase.length() - 2;
        int i3 = -1;
        if (length >= 0) {
            int iU0 = 0;
            loop0: while (iU0 < length) {
                char cCharAt = upperCase.charAt(iU0);
                if (cqk.i(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iU1 = iU0 + 1;
                            if (upperCase.charAt(iU1) == '*') {
                                do {
                                    iU1 = r5h.U0(upperCase, '*', iU1 + 1, 4);
                                    if (iU1 < 0) {
                                        break loop0;
                                    }
                                    i = iU1 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iU0 = iU1 + 2;
                            }
                        }
                        i3 = iU0;
                        break;
                    }
                    if (upperCase.charAt(iU0 + 1) != '-') {
                        i3 = iU0;
                        break;
                    }
                    iU0 = r5h.U0(upperCase, '\n', iU0 + 2, 4);
                    if (iU0 < 0) {
                        break;
                    }
                }
                iU0++;
            }
        }
        String strSubstring = (i3 < 0 || i3 > upperCase.length()) ? null : upperCase.substring(i3, Math.min(i3 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new gbh(id7Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    i2 = 0;
                } else if (!r5h.L0(upperCase, "EXCLUSIVE", false)) {
                    i2 = !r5h.L0(upperCase, "IMMEDIATE", false) ? 5 : 4;
                } else {
                    i2 = 3;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                break;
            case 81327:
                if (!strSubstring.equals("ROL") || r5h.L0(upperCase, " TO ", false)) {
                    i2 = 0;
                }
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            return new ibh(id7Var, str, i2);
        }
        if (strSubstring.equals("PRA") && r5h.L0(r5h.q1(upperCase.toLowerCase(Locale.ROOT), "journal_mode", ""), "=", false)) {
            a8gVar = a8g.o;
        }
        if (a8gVar != null) {
            return new gbh(id7Var, str, new hbh(id7Var, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new gbh(id7Var, str) : new hbh(id7Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
