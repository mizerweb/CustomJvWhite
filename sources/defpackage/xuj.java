package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class xuj implements jj6 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final dth b;
    public final b8h d;
    public final boolean e;
    public lj6 f;
    public int h;
    public final nmc c = new nmc();
    public byte[] g = new byte[1024];

    public xuj(String str, dth dthVar, b8h b8hVar, boolean z) {
        this.a = str;
        this.b = dthVar;
        this.d = b8hVar;
        this.e = z;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        if (this.e) {
            lj6Var = new ae7(lj6Var, this.d);
        }
        this.f = lj6Var;
        lj6Var.r(new vk0(-9223372036854775807L));
    }

    public final kyh a(long j2) {
        kyh kyhVarG = this.f.G(0, 3);
        a87 a87Var = new a87();
        a87Var.m = uya.n("text/vtt");
        a87Var.d = this.a;
        a87Var.r = j2;
        ewi.n(a87Var, kyhVarG);
        this.f.D();
        return kyhVarG;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        kj6Var.m(this.g, 0, 6, false);
        byte[] bArr = this.g;
        nmc nmcVar = this.c;
        nmcVar.L(6, bArr);
        if (yuj.a(nmcVar)) {
            return true;
        }
        kj6Var.m(this.g, 6, 3, false);
        nmcVar.L(9, this.g);
        return yuj.a(nmcVar);
    }

    @Override // defpackage.jj6
    public final void g(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        String strN;
        this.f.getClass();
        int length = (int) kj6Var.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int i4 = kj6Var.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        nmc nmcVar = new nmc(this.g);
        yuj.d(nmcVar);
        String strN2 = nmcVar.n(StandardCharsets.UTF_8);
        long jI0 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = nmcVar.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (yuj.a.matcher(strN3).matches()) {
                        do {
                            strN = nmcVar.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = wuj.a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = yuj.c(strGroup);
                String str = vqi.a;
                long jB = this.b.b(vqi.i0((jI0 + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                kyh kyhVarA = a(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                nmc nmcVar2 = this.c;
                nmcVar2.L(i6, bArr3);
                kyhVarA.f(this.h, nmcVar2);
                kyhVarA.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = yuj.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = vqi.a;
                jI0 = vqi.i0(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = nmcVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
