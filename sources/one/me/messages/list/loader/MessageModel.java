package one.me.messages.list.loader;

import android.text.Layout;
import defpackage.aja;
import defpackage.aka;
import defpackage.c0a;
import defpackage.cqk;
import defpackage.ewj;
import defpackage.f9j;
import defpackage.fia;
import defpackage.j1i;
import defpackage.k79;
import defpackage.kg8;
import defpackage.kja;
import defpackage.kw7;
import defpackage.mg5;
import defpackage.mw7;
import defpackage.nbh;
import defpackage.np0;
import defpackage.pll;
import defpackage.qia;
import defpackage.qt4;
import defpackage.ria;
import defpackage.rt2;
import defpackage.s04;
import defpackage.s5h;
import defpackage.t50;
import defpackage.u40;
import defpackage.vka;
import defpackage.xfa;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lkw7;", "Lk79;", "ria", "qia", "Companion", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MessageModel implements kw7, k79 {
    public static final Companion H = new Companion();
    public final xfa A;
    public Layout B;
    public Layout C;
    public qia D;
    public Long E;
    public int F;
    public final int G;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final f9j g;
    public final boolean h;
    public final boolean i;
    public final u40 j;
    public final boolean k;
    public final boolean l;
    public final aka m;
    public final fia n;
    public final ria o;
    public final ewj p;
    public final mg5 q;
    public final CharSequence r;
    public final boolean s;
    public final Integer t;
    public final long u;
    public final boolean v;
    public final kja w;
    public final long x;
    public final boolean y;
    public final boolean z;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public final MessageModel control(CharSequence displayText, long pinId) {
            u40 u40Var = u40.d;
            xfa xfaVar = xfa.SENT;
            return new MessageModel(0L, 0L, 0L, displayText, "", "", f9j.None, false, false, u40Var, false, false, null, null, new ria(pinId), null, 2, null, null, false, null, false, null, 0L, false, true, xfaVar, null, 0, -528565248, 0);
        }
    }

    public /* synthetic */ MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, f9j f9jVar, boolean z, boolean z2, u40 u40Var, boolean z3, boolean z4, aka akaVar, fia fiaVar, ria riaVar, ewj ewjVar, int i, mg5 mg5Var, String str2, boolean z5, Integer num, boolean z6, kja kjaVar, long j4, boolean z7, boolean z8, xfa xfaVar, qia qiaVar, int i2, int i3, int i4) {
        this(j, j2, j3, charSequence, str, charSequence2, f9jVar, z, z2, u40Var, (i3 & 1024) != 0 ? false : z3, (i3 & np0.q) != 0 ? false : z4, (i3 & np0.r) != 0 ? null : akaVar, (i3 & 8192) != 0 ? null : fiaVar, (i3 & 16384) != 0 ? null : riaVar, (32768 & i3) != 0 ? null : ewjVar, i, (131072 & i3) != 0 ? mg5.REGULAR : mg5Var, (262144 & i3) != 0 ? null : str2, (524288 & i3) != 0 ? false : z5, (1048576 & i3) != 0 ? null : num, 0L, (4194304 & i3) != 0 ? false : z6, kjaVar, j4, z7, z8, xfaVar, null, null, (i3 & 1073741824) != 0 ? null : qiaVar, null, (i4 & 1) != 0 ? -1 : i2);
    }

    public static final MessageModel control(CharSequence charSequence, long j) {
        return H.control(charSequence, j);
    }

    public static MessageModel q(MessageModel messageModel, String str, long j, int i) {
        long j2 = (i & 1) != 0 ? messageModel.a : -9223372036854775805L;
        long j3 = messageModel.b;
        long j4 = messageModel.c;
        CharSequence charSequence = (i & 8) != 0 ? messageModel.d : str;
        CharSequence charSequence2 = messageModel.e;
        CharSequence charSequence3 = messageModel.f;
        f9j f9jVar = messageModel.g;
        boolean z = messageModel.h;
        boolean z2 = messageModel.i;
        u40 u40Var = messageModel.j;
        boolean z3 = messageModel.k;
        boolean z4 = messageModel.l;
        aka akaVar = messageModel.m;
        fia fiaVar = messageModel.n;
        ria riaVar = messageModel.o;
        ewj ewjVar = messageModel.p;
        int i2 = messageModel.G;
        mg5 mg5Var = messageModel.q;
        CharSequence charSequence4 = messageModel.r;
        boolean z5 = messageModel.s;
        Integer num = messageModel.t;
        long j5 = (i & 2097152) != 0 ? messageModel.u : j;
        boolean z6 = messageModel.v;
        kja kjaVar = messageModel.w;
        long j6 = messageModel.x;
        boolean z7 = messageModel.y;
        boolean z8 = messageModel.z;
        xfa xfaVar = messageModel.A;
        Layout layout = messageModel.B;
        Layout layout2 = messageModel.C;
        qia qiaVar = messageModel.D;
        Long l = messageModel.E;
        int i3 = messageModel.F;
        messageModel.getClass();
        return new MessageModel(j2, j3, j4, charSequence, charSequence2, charSequence3, f9jVar, z, z2, u40Var, z3, z4, akaVar, fiaVar, riaVar, ewjVar, i2, mg5Var, charSequence4, z5, num, j5, z6, kjaVar, j6, z7, z8, xfaVar, layout, layout2, qiaVar, l, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && cqk.d(this.d, messageModel.d) && cqk.d(this.e, messageModel.e) && cqk.d(this.f, messageModel.f) && this.g == messageModel.g && this.h == messageModel.h && this.i == messageModel.i && cqk.d(this.j, messageModel.j) && this.k == messageModel.k && this.l == messageModel.l && cqk.d(this.m, messageModel.m) && cqk.d(this.n, messageModel.n) && cqk.d(this.o, messageModel.o) && cqk.d(this.p, messageModel.p) && this.G == messageModel.G && this.q == messageModel.q && cqk.d(this.r, messageModel.r) && this.s == messageModel.s && cqk.d(this.t, messageModel.t) && this.u == messageModel.u && this.v == messageModel.v && cqk.d(this.w, messageModel.w) && this.x == messageModel.x && this.y == messageModel.y && this.z == messageModel.z && this.A == messageModel.A && cqk.d(this.B, messageModel.B) && cqk.d(this.C, messageModel.C) && cqk.d(this.D, messageModel.D) && cqk.d(this.E, messageModel.E) && this.F == messageModel.F;
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a == k79Var.getItemId();
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n((this.j.hashCode() + nbh.n(nbh.n((this.g.hashCode() + mw7.f(mw7.f(mw7.f(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l);
        aka akaVar = this.m;
        int iHashCode = (iN + (akaVar == null ? 0 : akaVar.hashCode())) * 31;
        fia fiaVar = this.n;
        int iHashCode2 = (iHashCode + (fiaVar == null ? 0 : fiaVar.hashCode())) * 31;
        ria riaVar = this.o;
        int iHashCode3 = (iHashCode2 + (riaVar == null ? 0 : Long.hashCode(riaVar.a))) * 31;
        ewj ewjVar = this.p;
        int iHashCode4 = (this.q.hashCode() + c0a.f(this.G, (iHashCode3 + (ewjVar == null ? 0 : ewjVar.hashCode())) * 31, 31)) * 31;
        CharSequence charSequence = this.r;
        int iN2 = nbh.n((iHashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.s);
        Integer num = this.t;
        int iN3 = nbh.n(qt4.g((iN2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.u), 31, this.v);
        kja kjaVar = this.w;
        int iHashCode5 = (this.A.hashCode() + nbh.n(nbh.n(qt4.g((iN3 + (kjaVar == null ? 0 : kjaVar.hashCode())) * 31, 31, this.x), 31, this.y), 31, this.z)) * 31;
        Layout layout = this.B;
        int iHashCode6 = (iHashCode5 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.C;
        int iHashCode7 = (iHashCode6 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        qia qiaVar = this.D;
        int iHashCode8 = (iHashCode7 + (qiaVar == null ? 0 : qiaVar.hashCode())) * 31;
        Long l = this.E;
        return Integer.hashCode(this.F) + ((iHashCode8 + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // defpackage.kw7
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF() {
        return this.F;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        boolean z;
        if (!(k79Var instanceof MessageModel)) {
            return null;
        }
        u40 u40Var = this.j;
        kg8 kg8Var = u40Var.c;
        if (kg8Var != null || ((MessageModel) k79Var).j.c == null) {
            if (kg8Var != null ? kg8Var.a(((MessageModel) k79Var).j.c) : true) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        t50 t50Var = u40Var.b;
        j1i j1iVar = t50Var instanceof j1i ? (j1i) t50Var : null;
        int iA = j1iVar != null ? j1iVar.a() : 0;
        MessageModel messageModel = (MessageModel) k79Var;
        u40 u40Var2 = messageModel.j;
        t50 t50Var2 = u40Var2.b;
        j1i j1iVar2 = t50Var2 instanceof j1i ? (j1i) t50Var2 : null;
        return new aja(!cqk.d(this.B, messageModel.B), !cqk.d(this.C, messageModel.C), !cqk.d(this.e, messageModel.e), this.g != messageModel.g, !cqk.d(this.m, messageModel.m), !cqk.d(this.w, messageModel.w), this.k != messageModel.k, !u40Var.equals(u40Var2), z, !cqk.d(this.r, messageModel.r), !cqk.d(this.n, messageModel.n), iA != (j1iVar2 != null ? j1iVar2.a() : 0), !cqk.d(this.t, messageModel.t));
    }

    public final boolean o(rt2 rt2Var) {
        if (this.q.a() || (rt2Var instanceof s04)) {
            return false;
        }
        long jC = pll.c(rt2Var);
        int i = rt2Var.b.m;
        long j = this.c;
        return j > jC || (j == jC && i == 1) || (rt2Var.d0() && rt2Var.g0() && rt2Var.O());
    }

    public final boolean r() {
        return this.u != 0;
    }

    public final String toString() {
        String str;
        Layout layout = this.B;
        Layout layout2 = this.C;
        qia qiaVar = this.D;
        Long l = this.E;
        String strG = vka.g(this.F);
        StringBuilder sbS = qt4.s(this.a, "MessageModel(messageId=", ", serverId=");
        sbS.append(this.b);
        qt4.z(this.c, ", sortTime=", ", displayText=", sbS);
        sbS.append((Object) this.d);
        sbS.append(", displayTime=");
        sbS.append((Object) this.e);
        sbS.append(", decorTime=");
        sbS.append((Object) this.f);
        sbS.append(", viewStatus=");
        sbS.append(this.g);
        sbS.append(", drawBackground=");
        qt4.B(", needCorners=", ", attachInfo=", sbS, this.h, this.i);
        sbS.append(this.j);
        sbS.append(", isEdit=");
        sbS.append(this.k);
        sbS.append(", isContentLevel=");
        sbS.append(this.l);
        sbS.append(", messageTextStaticLayout=");
        sbS.append(this.m);
        sbS.append(", messageLink=");
        sbS.append(this.n);
        sbS.append(", controlInfo=");
        sbS.append(this.o);
        sbS.append(", widgetState=");
        sbS.append(this.p);
        sbS.append(", chatType=");
        int i = this.G;
        if (i == 1) {
            str = "DIALOG";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CHANNEL";
        } else {
            str = "CHAT";
        }
        sbS.append(str);
        sbS.append(", itemType=");
        sbS.append(this.q);
        sbS.append(", channelCountViewText=");
        sbS.append((Object) this.r);
        sbS.append(", hasUnsupportedAttach=");
        sbS.append(this.s);
        sbS.append(", commentsCounter=");
        sbS.append(this.t);
        sbS.append(", commentedMessageId=");
        sbS.append(this.u);
        sbS.append(", isForwardDisabled=");
        sbS.append(this.v);
        sbS.append(", reactionsData=");
        sbS.append(this.w);
        sbS.append(", senderId=");
        sbS.append(this.x);
        sbS.append(", isChannelMessage=");
        sbS.append(this.y);
        sbS.append(", isIncoming=");
        sbS.append(this.z);
        sbS.append(", deliveryStatus=");
        sbS.append(this.A);
        sbS.append(", sender=");
        sbS.append(layout);
        sbS.append(", alias=");
        sbS.append(layout2);
        sbS.append(", avatarParams=");
        sbS.append(qiaVar);
        sbS.append(", authorAccentSourceId=");
        sbS.append(l);
        return qt4.q(sbS, ", messageViewType=", strG, ")");
    }

    public final boolean w() {
        return this.o != null;
    }

    public final String x() {
        String strG = vka.g(this.F);
        StringBuilder sbS = qt4.s(this.a, "\n        MessageModel(mid=", ", sid=");
        sbS.append(this.b);
        qt4.z(this.c, " time=", " viewType=", sbS);
        sbS.append(strG);
        sbS.append(")\n    ");
        return s5h.x0(sbS.toString());
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, f9j f9jVar, boolean z, boolean z2, u40 u40Var, boolean z3, boolean z4, aka akaVar, fia fiaVar, ria riaVar, ewj ewjVar, int i, mg5 mg5Var, CharSequence charSequence4, boolean z5, Integer num, long j4, boolean z6, kja kjaVar, long j5, boolean z7, boolean z8, xfa xfaVar, Layout layout, Layout layout2, qia qiaVar, Long l, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = f9jVar;
        this.h = z;
        this.i = z2;
        this.j = u40Var;
        this.k = z3;
        this.l = z4;
        this.m = akaVar;
        this.n = fiaVar;
        this.o = riaVar;
        this.p = ewjVar;
        this.G = i;
        this.q = mg5Var;
        this.r = charSequence4;
        this.s = z5;
        this.t = num;
        this.u = j4;
        this.v = z6;
        this.w = kjaVar;
        this.x = j5;
        this.y = z7;
        this.z = z8;
        this.A = xfaVar;
        this.B = layout;
        this.C = layout2;
        this.D = qiaVar;
        this.E = l;
        this.F = i2;
    }
}
