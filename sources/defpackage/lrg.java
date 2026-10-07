package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class lrg extends hih {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(ArrayList arrayList) {
        super(kfc.e2);
        this.c = 5;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cjc cjcVar = (cjc) it.next();
            cjcVar.getClass();
            ul9 ul9Var = new ul9();
            ul9Var.put("cid", Long.valueOf(cjcVar.a));
            ul9Var.put("settings", Integer.valueOf(cjcVar.b));
            ul9Var.put("media", cjcVar.c.a());
            ul9Var.put("expiration", Integer.valueOf(cjcVar.d));
            List list = cjcVar.e;
            if (!list.isEmpty()) {
                List<jyg> list2 = list;
                ArrayList arrayList3 = new ArrayList(yw3.W0(list2, 10));
                for (jyg jygVar : list2) {
                    jygVar.getClass();
                    ul9 ul9Var2 = new ul9();
                    ul9Var2.put("type", Byte.valueOf(jygVar.a.a));
                    cy8 cy8Var = jygVar.b;
                    ul9Var2.put("coordinates", wm9.Q0(new ylc("x", Float.valueOf(cy8Var.a)), new ylc("y", Float.valueOf(cy8Var.b)), new ylc("w", Float.valueOf(cy8Var.c)), new ylc("h", Float.valueOf(cy8Var.d)), new ylc("rotation", Float.valueOf(cy8Var.e))));
                    ys3 ys3Var = jygVar.c;
                    if (ys3Var != null) {
                        ul9 ul9Var3 = new ul9();
                        ul9Var3.put(MLFeatureConfigProviderBase.URL_KEY, ys3Var.a);
                        ul9Var2.put("clickableLink", ul9Var3.b());
                    }
                    arrayList3.add(ul9Var2.b());
                }
                ul9Var.put("layers", arrayList3);
            }
            arrayList2.add(ul9Var.b());
        }
        d("stories", arrayList2);
    }

    @Override // defpackage.hih
    public short k() {
        switch (this.c) {
            case 6:
                lhb lhbVar = kfc.c;
                return (short) 119;
            case 10:
                lhb lhbVar2 = kfc.c;
                return (short) 79;
            case 13:
                lhb lhbVar3 = kfc.c;
                return (short) 83;
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(int i, int i2) {
        super(kfc.y2);
        this.c = 14;
        c(qt4.D(i), "type");
        c(1, "count");
        c(i2, "uploaderType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(long j, long j2, long j3, String str) {
        super(null);
        this.c = 13;
        f(j, "videoId");
        if (j2 != 0) {
            f(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            f(j3, "messageId");
        }
        if (ch3.r(str)) {
            return;
        }
        h(ApiProtocol.KEY_TOKEN, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(wyg wygVar, long j) {
        super(kfc.d2);
        this.c = 3;
        g("owner", wygVar.a());
        f(j, "storyId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(wyg wygVar, long j, cmf cmfVar) {
        super(kfc.c2);
        this.c = 4;
        g("owner", wygVar.a());
        f(j, "storyId");
        if (cmfVar != null) {
            g("reaction", wm9.Q0(new ylc("reactionType", Integer.valueOf(((l1h) cmfVar.b).a)), new ylc("id", (String) cmfVar.c)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(long[] jArr) {
        super(kfc.a2);
        this.c = 1;
        e("storyIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(byte b, long j, long j2) {
        super(kfc.b2);
        this.c = 0;
        f(j, "storyId");
        b(b, "filter");
        if (j2 != 0) {
            f(j2, "marker");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrg(long j, long j2, long j3) {
        super(kfc.S3);
        this.c = 8;
        f(j, "mediaId");
        f(j2, "messageId");
        f(j3, ApiProtocol.PARAM_CHAT_ID);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lrg(kfc kfcVar, int i) {
        super(kfcVar);
        this.c = i;
    }
}
