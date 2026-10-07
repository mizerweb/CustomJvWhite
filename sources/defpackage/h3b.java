package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class h3b extends hih {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(String str, String str2, String str3, long j, r60 r60Var, String str4, String str5, int i) {
        super(null);
        this.c = 17;
        if (str != null) {
            h("firstName", str);
        }
        if (str2 != null) {
            h("lastName", str2);
        }
        if (str3 != null) {
            h("photoToken", str3);
        }
        if (j != 0) {
            f(j, "photoId");
        }
        if (r60Var != null) {
            g("crop", r60Var.e());
        }
        if (!ch3.r(str4)) {
            h("description", str4.equals("$REMOVE$") ? "" : str4);
        }
        if (!ch3.r(str5)) {
            h("link", str5.equals("$REMOVE$") ? "" : str5);
        }
        h("avatarType", p.a(i));
    }

    @Override // defpackage.hih
    public boolean j() {
        switch (this.c) {
            case 5:
                return true;
            default:
                return super.j();
        }
    }

    @Override // defpackage.hih
    public short k() {
        switch (this.c) {
            case 6:
                lhb lhbVar = kfc.c;
                return (short) 181;
            case 7:
            case 12:
            case 14:
            case 15:
            case 16:
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
            default:
                return super.k();
            case 8:
                lhb lhbVar2 = kfc.c;
                return (short) 74;
            case 9:
                lhb lhbVar3 = kfc.c;
                return (short) 73;
            case 10:
                lhb lhbVar4 = kfc.c;
                return (short) 72;
            case 11:
                lhb lhbVar5 = kfc.c;
                return (short) 118;
            case 13:
                lhb lhbVar6 = kfc.c;
                return (short) 70;
            case 17:
                lhb lhbVar7 = kfc.c;
                return (short) 16;
            case 18:
                lhb lhbVar8 = kfc.c;
                return (short) 60;
            case 19:
                lhb lhbVar9 = kfc.c;
                return (short) 43;
            case 22:
                lhb lhbVar10 = kfc.c;
                return (short) 97;
            case 23:
                lhb lhbVar11 = kfc.c;
                return (short) 96;
            case 24:
                lhb lhbVar12 = kfc.c;
                return (short) 193;
            case 25:
                lhb lhbVar13 = kfc.c;
                return (short) 81;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(int i, int i2, Boolean bool) {
        super(kfc.w2);
        this.c = 15;
        if (i != 1) {
            c(qt4.D(i), "type");
        }
        c(i2, "count");
        if (bool != null) {
            this.a.put("profile", bool);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, int i, byte b) {
        super(null);
        this.c = i;
        switch (i) {
            case 19:
                super(null);
                if (j != 0) {
                    f(j, "photoId");
                    return;
                } else {
                    ore.p("photoId must not be 0");
                    throw null;
                }
            default:
                if (j != 0) {
                    f(j, ApiProtocol.PARAM_CHAT_ID);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, List list) {
        super(null);
        this.c = 8;
        if (j != 0) {
            f(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        d("messageIds", list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(String str) {
        super(null);
        this.c = 24;
        if (!ch3.r(str)) {
            h(ApiProtocol.KEY_TOKEN, str);
        } else {
            ore.k("token cannot be null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3b(kfc kfcVar, int i) {
        super(kfcVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(boolean z, int i) {
        super(kfc.v3);
        this.c = 20;
        a("delete", z);
        if (i != 0) {
            short s = 1;
            if (i == 1) {
                s = 0;
            } else if (i != 2) {
                throw null;
            }
            this.a.put("type", Short.valueOf(s));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b() {
        super(kfc.w3);
        this.c = 21;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, int i) {
        super(kfc.g2);
        this.c = 27;
        f(j, "storyId");
        c(i, "settings");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long[] jArr) {
        super(kfc.h2);
        this.c = 26;
        e("storyIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(wyg wygVar, long[] jArr) {
        super(kfc.i2);
        this.c = 29;
        g("owner", wygVar.a());
        e("storyIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, long j2, String str, b50 b50Var, ArrayList arrayList, ng5 ng5Var, Long l, int i) {
        super(kfc.Q1);
        this.c = 4;
        b50Var = (i & 8) != 0 ? null : b50Var;
        arrayList = (i & 16) != 0 ? null : arrayList;
        ng5Var = (i & 32) != 0 ? null : ng5Var;
        l = (i & 64) != 0 ? null : l;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        if (l != null) {
            this.a.put("postId", l);
        }
        f(j2, "messageId");
        if (str != null) {
            h("text", str);
        }
        if (b50Var != null) {
            d("attachments", b50Var);
        }
        if (arrayList != null) {
            d("elements", arrayList);
        }
        if (ng5Var != null) {
            g("delayedAttributes", ng5Var.c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, List list, Long l) {
        super(kfc.V1);
        this.c = 7;
        if (!list.isEmpty()) {
            f(j, ApiProtocol.PARAM_CHAT_ID);
            if (l != null) {
                this.a.put("postId", l);
            }
            d("messageIds", list);
            return;
        }
        ore.p("mesageIds can't be empty");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(ArrayList arrayList) {
        super(kfc.Z1);
        this.c = 28;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wyg) it.next()).a());
        }
        d("owners", arrayList2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, long[] jArr) {
        super(kfc.l2);
        this.c = 5;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        e("messageIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, Collection collection, int i, boolean z, mg5 mg5Var, Long l, int i2) {
        super(kfc.P1);
        this.c = 0;
        mg5Var = (i2 & 16) != 0 ? mg5.REGULAR : mg5Var;
        l = (i2 & 32) != 0 ? null : l;
        f(j, ApiProtocol.PARAM_CHAT_ID);
        d("messageIds", ww3.T1(collection));
        if (i != 0) {
            h("complaint", tt2.b(i));
        }
        a("forMe", z);
        h("itemType", mg5Var.name());
        if (l != null) {
            this.a.put("postId", l);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3b(long j, Long l, zic zicVar) {
        this(j, l, 0L, zicVar, null);
        this.c = 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3b(long j, Long l, long j2, zic zicVar, Boolean bool) {
        super(kfc.N1);
        this.c = 12;
        if (j != 0) {
            f(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (l != null) {
            this.a.put("postId", l);
        }
        if (j2 != 0) {
            f(j2, "userId");
        }
        g("message", zicVar.a());
        if (bool != null) {
            this.a.put("notify", bool);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h3b(long j, long j2, zic zicVar, Boolean bool) {
        this(j, null, j2, zicVar, bool);
        this.c = 12;
    }
}
