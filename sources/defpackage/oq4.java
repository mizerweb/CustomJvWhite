package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oq4 extends l40 {
    public final int d;
    public final Long e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final r60 k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;
    public final gda p;
    public final String q;

    public oq4(int i, Long l, List list, String str, String str2, String str3, String str4, r60 r60Var, String str5, String str6, boolean z, int i2, gda gdaVar, String str7, boolean z2, boolean z3) {
        super(w50.CONTROL, z2, z3);
        this.d = i;
        this.e = l;
        this.f = list;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = r60Var;
        this.l = str5;
        this.m = str6;
        this.n = z;
        this.o = i2;
        this.p = gdaVar;
        this.q = str7;
    }

    @Override // defpackage.l40
    public final HashMap a() {
        String str;
        String str2;
        HashMap mapA = super.a();
        int i = this.d;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "add";
                break;
            case 4:
                str = "remove";
                break;
            case 5:
                str = "leave";
                break;
            case 6:
                str = "title";
                break;
            case 7:
                str = "icon";
                break;
            case 8:
                str = "hello";
                break;
            case 9:
                str = "system";
                break;
            case 10:
                str = "joinByLink";
                break;
            case 11:
                str = "pin";
                break;
            case 12:
                str = "botStarted";
                break;
            default:
                throw null;
        }
        mapA.put("event", str);
        List list = this.f;
        if (list != null && list.size() > 0) {
            mapA.put("userIds", list);
        }
        Long l = this.e;
        if (l != null && l.longValue() != 0) {
            mapA.put("userId", l);
        }
        String str3 = this.g;
        if (str3 != null) {
            mapA.put("title", str3);
        }
        String str4 = this.h;
        if (str4 != null) {
            mapA.put("photoToken", str4);
        }
        r60 r60Var = this.k;
        if (r60Var != null) {
            mapA.put("crop", r60Var.e());
        }
        if (i == 3) {
            mapA.put("showHistory", Boolean.valueOf(this.n));
        }
        if (i == 2) {
            int i2 = this.o;
            if (i2 == 1) {
                str2 = "UNKNOWN";
            } else if (i2 == 2) {
                str2 = "DIALOG";
            } else if (i2 == 3) {
                str2 = "CHAT";
            } else if (i2 == 4) {
                str2 = "CHANNEL";
            } else {
                if (i2 != 5) {
                    throw null;
                }
                str2 = "GROUP_CHAT";
            }
            mapA.put("chatType", str2);
        }
        String str5 = this.q;
        if (!ch3.r(str5)) {
            mapA.put("startPayload", str5);
        }
        return mapA;
    }
}
