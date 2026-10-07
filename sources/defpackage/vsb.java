package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class vsb extends hih {
    public static final nv8 d = new nv8(3);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(String str, List list, String str2, String str3, int i) {
        super(kfc.C);
        this.c = 16;
        Boolean bool = Boolean.TRUE;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        bool = (i & 16) != 0 ? null : bool;
        h("trackId", str);
        if (str2 != null && str2.length() != 0) {
            h("password", str2);
        }
        if (str3 != null && str3.length() != 0) {
            h("hint", str3);
        }
        if (bool != null) {
            this.a.put("remove2fa", bool);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(((t5i) it.next()).a));
        }
        d("expectedCapabilities", arrayList);
    }

    @Override // defpackage.hih
    public short k() {
        switch (this.c) {
            case 1:
                lhb lhbVar = kfc.c;
                return (short) 29;
            case 2:
                lhb lhbVar2 = kfc.c;
                return (short) 26;
            case 3:
                lhb lhbVar3 = kfc.c;
                return (short) 261;
            case 4:
                lhb lhbVar4 = kfc.c;
                return (short) 260;
            case 5:
                lhb lhbVar5 = kfc.c;
                return (short) 259;
            case 24:
                lhb lhbVar6 = kfc.c;
                return (short) 76;
            case 27:
                lhb lhbVar7 = kfc.c;
                return (short) 54;
            case 28:
                lhb lhbVar8 = kfc.c;
                return (short) 117;
            case 29:
                lhb lhbVar9 = kfc.c;
                return (short) 52;
            default:
                return super.k();
        }
    }

    @Override // defpackage.hih
    public te9 m() {
        switch (this.c) {
            case 0:
                return d;
            default:
                return super.m();
        }
    }

    @Override // defpackage.hih
    public boolean o() {
        switch (this.c) {
            case 0:
                return true;
            case 9:
                return false;
            case 10:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 14:
                return false;
            case 17:
                return false;
            case 18:
                return false;
            case 19:
                return false;
            default:
                return super.o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb() {
        super(kfc.t);
        this.c = 11;
        this.a.put("type", (short) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(String str, String str2) {
        super(kfc.A);
        this.c = 19;
        h("trackId", str);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        h("email", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsb(kfc kfcVar, int i) {
        super(kfcVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(long[] jArr) {
        super(kfc.B3);
        this.c = 22;
        e("historyIds", jArr == null ? new long[0] : jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(String str) {
        super(kfc.D);
        this.c = 7;
        if (str == null || str.length() == 0) {
            return;
        }
        h("trackId", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(int i, int i2, long j, String str, String str2) {
        super(null);
        this.c = 2;
        if (i == 0 && ch3.r(str)) {
            ore.q("Asset type or sectionId should be set");
            throw null;
        }
        if (i != 0) {
            h("type", qt4.f(i));
        }
        if (!ch3.r(str)) {
            h("sectionId", str);
        }
        f(j, "from");
        c(i2, "count");
        if (str2 != null) {
            h("query", str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(long j) {
        super(kfc.A3);
        this.c = 23;
        f(j, "callHistorySync");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsb(String str, long j) {
        super(kfc.M2);
        this.c = 0;
        h(SdkMetricStatEvent.VALUE_KEY, str);
        f(j, "userId");
    }
}
