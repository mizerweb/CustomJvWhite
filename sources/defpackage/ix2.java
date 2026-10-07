package defpackage;

import android.graphics.Rect;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class ix2 {
    public static final ix2 c = new ix2(0, 0);
    public static final ix2 d = new ix2(0, 1);
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ ix2(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static float a(sub subVar, int i, int i2) {
        int i3 = yub.$EnumSwitchMapping$0[subVar.ordinal()];
        if (i3 == 1) {
            return i / 2.0f;
        }
        if (i3 == 2) {
            return i2 + 12;
        }
        if (i3 == 3) {
            return i - (i2 + 12);
        }
        ore.o();
        return 0.0f;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        switch (this.a) {
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }
        return this.b;
    }

    public int d() {
        switch (this.a) {
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return this.b;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.b;
    }

    public boolean h() {
        return (this.b & 2) != 0;
    }

    public boolean i(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    public boolean j() {
        return (this.b & 8) != 0;
    }

    public xub k(int i, int i2, int i3, int i4, Rect rect, int i5, int i6, int i7, int i8) {
        sub subVar;
        int i9 = i2 + i4;
        int i10 = (i3 / 2) + i;
        int i11 = i8 * 2;
        int i12 = i6 + i7 + i11;
        int i13 = i5 + i7 + i11;
        int i14 = this.b;
        int i15 = i9 + i14;
        int i16 = i15 + i12;
        int i17 = rect.bottom;
        boolean z = (i16 <= i17) || i17 - i9 >= i2 - rect.top;
        tub tubVar = z ? tub.a : tub.b;
        if (!z) {
            i15 = (i2 - i14) - i12;
        }
        int i18 = rect.right - i10;
        int i19 = i13 / 2;
        sub subVar2 = sub.c;
        if (i18 > i19) {
            subVar = sub.a;
        } else {
            subVar = i18 < i19 ? subVar2 : sub.b;
        }
        int iA = (int) (i10 - a(subVar, i13, i8));
        int i20 = rect.right - i13;
        int i21 = rect.left;
        if (i20 < i21) {
            i20 = i21;
        }
        int iV = oc9.v(iA, i21, i20);
        float f = -2.0f;
        if (subVar != subVar2 ? !z : z) {
            f = 2.0f;
        }
        return new xub(iV, i15, tubVar, subVar, f);
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return "Restrictions{restrictions=" + i2 + ", cannotInvite=" + i(1) + ", cannotModifyIcon=" + i(2) + ", cannotModifyTitle=" + i(4) + ", cannotLeave=" + i(8) + ", cannotPin=" + i(16) + ", cannotLiveLocation=" + i(32) + ", cannotInput=" + i(64) + ", cannotStopBot=" + i(np0.m) + ", cannotComplain=" + i(np0.n) + ", cannotDeleteMessage=" + i(np0.o) + ", cannotDeleteChat=" + i(1024) + ", cannotHideChat=" + i(np0.q) + ", cannotClearChat=" + i(np0.r) + '}';
            case 1:
                StringBuilder sb = new StringBuilder("ContactFlags{");
                sb.append(i2);
                sb.append("|inContacts=");
                sb.append((i2 & np0.o) != 0);
                sb.append(",isOfficial=");
                sb.append((i2 & 1) != 0);
                sb.append(",isBot=");
                sb.append(h());
                sb.append(",isExternal=");
                sb.append((i2 & 4) != 0);
                sb.append(",isServiceAccount=");
                sb.append(j());
                sb.append(",hasWebapp=");
                sb.append((i2 & 16) != 0);
                sb.append(",noForward=");
                sb.append((i2 & 32) != 0);
                sb.append(",isRestricted=");
                sb.append((i2 & 64) != 0);
                sb.append(",hideStories=");
                sb.append((i2 & 1024) != 0);
                sb.append(",isBusinessAccountPaid=");
                return c0a.p(sb, (i2 & np0.m) != 0, '}');
            default:
                return super.toString();
        }
    }
}
