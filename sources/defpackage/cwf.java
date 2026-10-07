package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class cwf implements h65 {
    public final /* synthetic */ int a;
    public final f83 b;

    public cwf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = z13.c;
                break;
            case 2:
                this.b = z47.c;
                break;
            case 3:
                this.b = ql8.c;
                break;
            case 4:
                this.b = mxc.c;
                break;
            case 5:
                this.b = e6j.c;
                break;
            default:
                this.b = dwf.c;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ha9] */
    /* JADX WARN: Type inference failed for: r13v10 */
    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        byte bByteValue;
        Byte bValueOf;
        t65 ooVar;
        t65 vi6Var;
        t65 e27Var;
        u65 u65Var;
        t65 vf6Var;
        t3f t3fVar;
        int i = 15;
        int i2 = 9;
        int i3 = 2;
        Byte b = 0;
        Bundle bundle2 = null;
        switch (this.a) {
            case 0:
                if (!((LinkedHashSet) ((dwf) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                dwf.c.getClass();
                if (m65Var.equals(dwf.d)) {
                    return new u65(str, m65Var, bundle, 0, null, false, new ruf(2, ha9Var), 56);
                }
                String name = cwf.class.getName();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return null;
                }
                je9 je9Var = je9.f;
                if (!a4cVar.b(je9Var)) {
                    return null;
                }
                a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                return null;
            case 1:
                if (!((LinkedHashSet) ((z13) this.b).b).contains(m65Var)) {
                    return null;
                }
                if (!m65Var.equals(z13.d)) {
                    ore.k(qt4.m("unknown route ", m65Var));
                    return null;
                }
                final long jH0 = sb8.h0(bundle, "chat_id");
                final String strJ0 = sb8.j0(bundle, "attach_id");
                final long jH1 = sb8.h0(bundle, "msg_id");
                Boolean boolW = sb8.W(bundle, "single");
                final boolean zBooleanValue = boolW != null ? boolW.booleanValue() : false;
                Boolean boolW2 = sb8.W(bundle, "desc");
                final boolean zBooleanValue2 = boolW2 != null ? boolW2.booleanValue() : false;
                String string = bundle.getString("item_type_id");
                if (string != null) {
                    bValueOf = Byte.valueOf(Byte.parseByte(string));
                }
                if (b != 0) {
                    b = bValueOf;
                    bByteValue = b.byteValue();
                } else {
                    b = bValueOf;
                    bByteValue = mg5.REGULAR.a;
                }
                final byte b2 = bByteValue;
                final ha9 ha9Var2 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                return new u65(str, m65Var, bundle, 0, new q65(new k82(i), new k82(16)), false, new t65() { // from class: y13
                    @Override // defpackage.t65
                    public final Object t() {
                        return new ChatMediaViewerScreen(jH0, strJ0, jH1, zBooleanValue, zBooleanValue2, b2, ha9Var2);
                    }
                }, 40);
            case 2:
                if (!((LinkedHashSet) ((z47) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var3 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                z47.c.getClass();
                if (!m65Var.equals(z47.d)) {
                    if (!m65Var.equals(z47.f)) {
                        if (m65Var.equals(z47.g)) {
                            e27Var = new e27(0, sb8.Z(bundle, "ids"), ha9Var3);
                        } else if (m65Var.equals(z47.i)) {
                            String string2 = bundle.getString("folder_id");
                            String str2 = string2 == null ? "" : string2;
                            String string3 = bundle.getString("tag");
                            String str3 = string3 == null ? "" : string3;
                            Boolean boolW3 = sb8.W(bundle, "filters_enabled");
                            ooVar = new zj1(str2, str3, boolW3 != null ? boolW3.booleanValue() : false, sb8.Z(bundle, "members_ids"), ha9Var3);
                        } else if (m65Var.equals(z47.e)) {
                            vi6Var = new vi6(bundle, ha9Var3, 1);
                        } else {
                            if (!m65Var.equals(z47.h)) {
                                return null;
                            }
                            ooVar = new oo(i2, sb8.i0(bundle, "ids"), ha9Var3, bundle.getString("tag"));
                        }
                        return new u65(str, m65Var, bundle, 0, null, false, ooVar, 56);
                    }
                    e27Var = new d27(sb8.j0(bundle, "id"), ha9Var3, 0);
                    ooVar = e27Var;
                    return new u65(str, m65Var, bundle, 0, null, false, ooVar, 56);
                }
                vi6Var = new i(12, ha9Var3);
                ooVar = vi6Var;
                return new u65(str, m65Var, bundle, 0, null, false, ooVar, 56);
            case 3:
                if (!((LinkedHashSet) ((ql8) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var4 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                ql8.c.getClass();
                if (m65Var.equals(ql8.d)) {
                    u65Var = new u65(str, m65Var, bundle, 1, null, false, new i(14, ha9Var4), 48);
                } else if (m65Var.equals(ql8.e)) {
                    int i4 = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, -1);
                    Long lY = sb8.Y(bundle, "id");
                    String string4 = bundle.getString("type");
                    Integer numX = sb8.X(bundle, "height");
                    if (i4 != 0 || lY != null || string4 != null || numX != null) {
                        bundle2 = new Bundle();
                        if (i4 != -1) {
                            bundle2.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i4);
                        }
                        if (lY != null) {
                            bundle2.putLong("id", lY.longValue());
                        }
                        if (string4 != null) {
                            bundle2.putString("type", string4);
                        }
                        if (numX != null) {
                            bundle2.putInt("height", numX.intValue());
                        }
                    }
                    u65Var = new u65(str, m65Var, bundle, 1, new q65(new q38(8), new q38(i2)), false, new yj1(7, bundle2), 32);
                } else {
                    if (!m65Var.equals(ql8.f)) {
                        ore.k(qt4.m("invalid route ", m65Var));
                        return null;
                    }
                    u65Var = new u65(str, m65Var, bundle, 1, new q65(new q38(10), new q38(11)), false, new i(15, ha9Var4), 32);
                }
                return u65Var;
            case 4:
                if (!((LinkedHashSet) ((mxc) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var5 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                f2 q65Var = s65.c;
                if (m65Var.equals(mxc.d)) {
                    q65Var = new q65(new gvc(2), new gvc(3));
                    int iG0 = sb8.g0(bundle, "request_code");
                    Long lY2 = sb8.Y(bundle, "chat_id");
                    String string5 = bundle.getString("chat_scope_id");
                    if (string5 == null) {
                        t3fVar = t3f.e;
                    } else {
                        if (string5.length() == 0) {
                            string5 = null;
                        }
                        if (string5 != null) {
                            t3fVar = new t3f(string5, b, i3);
                        } else {
                            t3fVar = t3f.e;
                        }
                    }
                    vf6Var = new e75(iG0, ha9Var5, lY2, t3fVar);
                } else {
                    if (!m65Var.equals(mxc.e)) {
                        ore.k(qt4.m("invalid route ", m65Var));
                        return null;
                    }
                    vf6Var = new vf6(sb8.g0(bundle, "title"), sb8.Z(bundle, "preselected_ids"), ha9Var5, 4);
                }
                return new u65(str, m65Var, bundle, 1, q65Var, false, vf6Var, 32);
            default:
                if (((LinkedHashSet) ((e6j) this.b).b).contains(m65Var)) {
                    return new u65(str, m65Var, bundle, 0, new q65(new o0j(5)), false, new knd(sb8.h0(bundle, "chat_id"), sb8.j0(bundle, "video_url"), sb8.h0(bundle, "msg_id"), new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE))), 40);
                }
                return null;
        }
    }

    @Override // defpackage.h65
    public final f83 b() {
        switch (this.a) {
            case 0:
                return (dwf) this.b;
            case 1:
                return (z13) this.b;
            case 2:
                return (z47) this.b;
            case 3:
                return (ql8) this.b;
            case 4:
                return (mxc) this.b;
            default:
                return (e6j) this.b;
        }
    }
}
