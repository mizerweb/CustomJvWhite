package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes.dex */
public final class z0a implements h65 {
    public final /* synthetic */ int a;
    public final Object b;

    public z0a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = vu.c;
                break;
            case 2:
            default:
                this.b = a1a.c;
                break;
            case 3:
                this.b = m87.c;
                break;
            case 4:
                this.b = dh9.c;
                break;
            case 5:
                this.b = pxf.c;
                break;
            case 6:
                this.b = bhj.c;
                break;
        }
    }

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        y3f y3fVarValueOf;
        f2 q65Var;
        t65 zj1Var;
        u65 u65Var;
        t65 s63Var;
        u65 u65Var2;
        t65 ak1Var;
        switch (this.a) {
            case 0:
                if (!((LinkedHashSet) ((a1a) this.b).b).contains(m65Var)) {
                    return null;
                }
                final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                a1a.c.getClass();
                if (m65Var.equals(a1a.d)) {
                    Boolean boolW = sb8.W(bundle, "from_qr_scanner");
                    final boolean zBooleanValue = boolW != null ? boolW.booleanValue() : false;
                    final Long lY = sb8.Y(bundle, "source_id");
                    Boolean boolW2 = sb8.W(bundle, "text_story");
                    final boolean zBooleanValue2 = boolW2 != null ? boolW2.booleanValue() : false;
                    Boolean boolW3 = sb8.W(bundle, "story_camera");
                    final boolean zBooleanValue3 = boolW3 != null ? boolW3.booleanValue() : false;
                    Boolean boolW4 = sb8.W(bundle, "use_videos");
                    final boolean zBooleanValue4 = boolW4 != null ? boolW4.booleanValue() : false;
                    Boolean boolW5 = sb8.W(bundle, "need_camera");
                    final boolean zBooleanValue5 = boolW5 != null ? boolW5.booleanValue() : false;
                    Boolean boolW6 = sb8.W(bundle, "rect_crop");
                    final boolean zBooleanValue6 = boolW6 != null ? boolW6.booleanValue() : false;
                    Boolean boolW7 = sb8.W(bundle, "multi_select");
                    boolean zBooleanValue7 = boolW7 != null ? boolW7.booleanValue() : false;
                    Boolean boolW8 = sb8.W(bundle, "open_editor");
                    final boolean zBooleanValue8 = boolW8 != null ? boolW8.booleanValue() : false;
                    q65Var = r65.c;
                    final boolean z = zBooleanValue7;
                    zj1Var = new t65() { // from class: y0a
                        @Override // defpackage.t65
                        public final Object t() {
                            return new MediaPickerScreen(new ph7(zBooleanValue5, zBooleanValue4, z, zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue6, zBooleanValue8, np0.r), lY, ha9Var);
                        }
                    };
                } else {
                    if (!m65Var.equals(a1a.e)) {
                        String name = z0a.class.getName();
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
                    }
                    String strJ0 = sb8.j0(bundle, "image_uri");
                    jx4 jx4VarValueOf = jx4.valueOf(sb8.j0(bundle, "mode"));
                    Boolean boolW9 = sb8.W(bundle, "stories_mode");
                    boolean zBooleanValue9 = boolW9 != null ? boolW9.booleanValue() : false;
                    String string = bundle.getString("screen");
                    if (string == null || (y3fVarValueOf = y3f.valueOf(string)) == null) {
                        y3fVarValueOf = y3f.AVATAR_PICKER_CROP;
                    }
                    y3f y3fVar = y3fVarValueOf;
                    q65Var = new q65(new bh9(19), new bh9(20));
                    zj1Var = new zj1(strJ0, jx4VarValueOf, ha9Var, zBooleanValue9, y3fVar);
                }
                return new u65(str, m65Var, bundle, 1, q65Var, false, zj1Var, 32);
            case 1:
                if (!((LinkedHashSet) ((vu) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var2 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                if (m65Var.equals(vu.d)) {
                    return new u65(str, m65Var, bundle, 1, null, false, new i(2, ha9Var2), 48);
                }
                ore.k(qt4.m("Unknown route=", m65Var));
                return null;
            case 2:
                if (!((LinkedHashSet) mn4.c.b).contains(m65Var)) {
                    return null;
                }
                if (!m65Var.equals(mn4.d)) {
                    if (m65Var.equals(mn4.e)) {
                        s63Var = new s63(9, this);
                    } else {
                        if (!m65Var.equals(mn4.f)) {
                            ore.k(qt4.m("unknown route ", m65Var));
                            return null;
                        }
                        u65Var = new u65(str, m65Var, bundle, 0, null, false, new jn4(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE), 0), 56);
                    }
                    return u65Var;
                }
                s63Var = new p51(29);
                u65Var = new u65(str, m65Var, bundle, 2, null, false, s63Var, 48);
                return u65Var;
            case 3:
                if (!((LinkedHashSet) ((m87) this.b).b).contains(m65Var)) {
                    return null;
                }
                final ha9 ha9Var3 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                if (!m65Var.equals(m87.d)) {
                    ore.k(qt4.m("invalid route ", m65Var));
                    return null;
                }
                final long[] jArrI0 = sb8.i0(bundle, "messages_ids");
                final Long lY2 = sb8.Y(bundle, "attach_id");
                Boolean boolW10 = sb8.W(bundle, "is_forward_attach");
                final boolean zBooleanValue10 = boolW10 != null ? boolW10.booleanValue() : false;
                Boolean boolW11 = sb8.W(bundle, "show_ext_sharing");
                final boolean zBooleanValue11 = boolW11 != null ? boolW11.booleanValue() : false;
                return new u65(str, m65Var, bundle, 1, null, false, new t65() { // from class: l87
                    @Override // defpackage.t65
                    public final Object t() {
                        return new ForwardPickerScreen(jArrI0, ha9Var3, lY2, zBooleanValue10, zBooleanValue11);
                    }
                }, 48);
            case 4:
                ((dh9) this.b).getClass();
                if (m65Var.equals(dh9.d)) {
                    return new u65(str, m65Var, bundle, 0, new q65(new bh9(0), new bh9(1)), false, new ch9(0), 40);
                }
                return null;
            case 5:
                if (!((LinkedHashSet) ((pxf) this.b).b).contains(m65Var)) {
                    return null;
                }
                if (m65Var.equals(pxf.d)) {
                    Boolean boolW12 = sb8.W(bundle, "need_fade");
                    u65Var2 = new u65(str, m65Var, bundle, 1, boolW12 != null ? boolW12.booleanValue() : false ? new q65(new irf(10), new irf(11)) : r65.c, false, new yj1(9, bundle), 32);
                } else {
                    if (!m65Var.equals(pxf.e)) {
                        ore.k(qt4.m("invalid route ", m65Var));
                        return null;
                    }
                    String string2 = bundle.getString("text");
                    if (string2 != null && string2.length() != 0) {
                        ShareData shareData = new ShareData(0, null, null, null, null, null, null, null, 255, null);
                        shareData.text = string2;
                        shareData.type = 0;
                        bundle.putParcelable("share_data", shareData);
                    }
                    u65Var2 = new u65(str, m65Var, bundle, 1, null, false, new yj1(10, bundle), 48);
                }
                return u65Var2;
            default:
                if (!((LinkedHashSet) ((bhj) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var4 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                bhj.c.getClass();
                if (m65Var.equals(bhj.d)) {
                    ak1Var = new ruf(10, ha9Var4);
                } else {
                    if (!m65Var.equals(bhj.e)) {
                        ore.k(qt4.m("invalid route ", m65Var));
                        return null;
                    }
                    ak1Var = new ak1(sb8.h0(bundle, "bot_id"), 9, ha9Var4);
                }
                return new u65(str, m65Var, bundle, 1, null, false, ak1Var, 48);
        }
    }

    @Override // defpackage.h65
    public final f83 b() {
        switch (this.a) {
            case 0:
                return (a1a) this.b;
            case 1:
                return (vu) this.b;
            case 2:
                return mn4.c;
            case 3:
                return (m87) this.b;
            case 4:
                return (dh9) this.b;
            case 5:
                return (pxf) this.b;
            default:
                return (bhj) this.b;
        }
    }

    public z0a(ny8 ny8Var) {
        this.a = 2;
        this.b = ny8Var;
    }
}
