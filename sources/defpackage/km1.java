package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.List;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class km1 extends a8j implements g32 {
    public final boolean c;
    public final String d;
    public final b95 e;
    public final l92 f;
    public final p32 g;
    public final msc h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final x02 m;
    public final mjg n;
    public final mjg o;
    public boolean p;
    public final xx6 q;

    public km1(boolean z, long j, String str, String str2, String str3, b95 b95Var, l92 l92Var, p4c p4cVar, p32 p32Var, msc mscVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, tm4 tm4Var) {
        tnh tnhVar;
        jz0 jz0Var;
        String string;
        this.c = z;
        this.d = str3;
        this.e = b95Var;
        this.f = l92Var;
        this.g = p32Var;
        this.h = mscVar;
        this.i = ny8Var2;
        this.j = ny8Var4;
        this.k = ny8Var;
        this.l = ny8Var3;
        x02 x02VarI = b95Var.i(str3);
        x02VarI = x02VarI == null ? (x02) b95Var.i.a.getValue() : x02VarI;
        this.m = x02VarI;
        boolean zH = b95Var.h();
        int i = 1;
        int i2 = 0;
        boolean z2 = mscVar.a(z) == yp9.b && !zH;
        ok0 ok0Var = new ok0(gm0.a(m3c.a(str, p4cVar), Long.valueOf(j)), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null);
        gjg gjgVarZ = x02VarI.z();
        qe1 qe1Var = new qe1(null, null, null, ok0Var, null, false, null, null, null, 469);
        dm1 dm1Var = (!z || zH) ? null : dm1.VIDEO_ACCEPT_WITH_TITLE;
        gjg gjgVarZ2 = x02VarI.z();
        if (((dz4) gjgVarZ2.getValue()).n || ((dz4) gjgVarZ2.getValue()).o != null) {
            tnhVar = null;
        } else {
            phl phlVar = ((dz4) x02VarI.z().getValue()).a;
            if ((phlVar instanceof m32 ? (m32) phlVar : null) != null) {
                tnhVar = new tnh(R.string.call_incoming_warning_not_contact);
            } else {
                gm0.Y(km1.class.getName(), "Early return in getNotContactWarning cuz of (callsEngine.activeCallInfo.value.target as? CallTarget.User)?.userId is null");
                tnhVar = null;
            }
        }
        boolean z3 = ((dz4) gjgVarZ.getValue()).n;
        boolean z4 = ((dz4) gjgVarZ.getValue()).p;
        if (((dz4) gjgVarZ.getValue()).o != null) {
            string = ((p32) ny8Var2.getValue()).a.getString(R.string.call_incoming_from_organization);
            jz0Var = null;
        } else {
            jz0Var = null;
            string = null;
        }
        mjg mjgVarA = p90.a(new em1(qe1Var, z2, null, "", dm1.DECLINE_WITH_TITLE, dm1.AUDIO_ACCEPT_WITH_TITLE, dm1Var, tnhVar, z3, Boolean.valueOf(z4), string));
        this.n = mjgVarA;
        this.o = mjgVarA;
        this.q = tm4Var.a();
        l92Var.f(this);
        yab.i0(this.b, jz0Var, 0, new hm1(this, jz0Var, i2), 3);
        yab.i0(this.b, jz0Var, 0, new hm1(this, jz0Var, i), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(km1 km1Var, nq4 nq4Var) {
        jm1 jm1Var;
        Object value;
        Object objA;
        if (nq4Var instanceof jm1) {
            jm1Var = (jm1) nq4Var;
            int i = jm1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm1Var.f = i - Integer.MIN_VALUE;
            } else {
                jm1Var = new jm1(km1Var, nq4Var);
            }
        } else {
            jm1Var = new jm1(km1Var, nq4Var);
        }
        Object objC = jm1Var.d;
        int i2 = jm1Var.f;
        if (i2 == 0) {
            ch3.d0(objC);
            p32 p32Var = km1Var.g;
            boolean z = km1Var.c;
            jm1Var.f = 1;
            objC = p32Var.c(z, jm1Var);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objC);
        }
        CharSequence charSequence = (CharSequence) objC;
        mjg mjgVar = km1Var.n;
        do {
            value = mjgVar.getValue();
            objA = (gm1) value;
            em1 em1Var = objA instanceof em1 ? (em1) objA : null;
            if (em1Var != null) {
                objA = em1.a(em1Var, null, false, null, charSequence, null, false, null, null, 2039);
            }
        } while (!mjgVar.h(value, objA));
        return sbi.a;
    }

    public static boolean E(be1 be1Var, vg4 vg4Var) {
        List listS;
        return (be1Var.l || (vg4Var != null && vg4Var.h())) || (vg4Var != null && (listS = vg4Var.s()) != null && (listS.isEmpty() ^ true));
    }

    public final void C(boolean z) {
        mjg mjgVar;
        Object value;
        this.m.B(z);
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new fm1(true, true)));
    }

    public final void D() {
        mjg mjgVar;
        Object value;
        this.m.p(it7.c);
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new fm1(false, false)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        mjg mjgVar;
        Object value;
        super.onCallAccepted();
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new fm1(true, false)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new fm1(false, false)));
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new fm1(true, false)));
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    @Override // defpackage.a8j
    public final void y() {
        this.f.e(this);
    }
}
