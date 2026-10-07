package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public final class jmd implements h65 {
    public final /* synthetic */ int a;
    public final f83 b;

    public jmd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ha2.c;
                break;
            case 2:
                this.b = ij5.c;
                break;
            case 3:
                this.b = ja8.c;
                break;
            case 4:
                this.b = dob.c;
                break;
            case 5:
                this.b = xqg.c;
                break;
            default:
                this.b = lmd.c;
                break;
        }
    }

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 hmdVar;
        i iVar;
        i iVar2;
        q65 q65Var;
        t65 e75Var;
        t65 ooVar;
        switch (this.a) {
            case 0:
                kmd kmdVar = kmd.LOCAL_CHAT;
                if (!((LinkedHashSet) ((lmd) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                lmd.c.getClass();
                if (m65Var.equals(lmd.d)) {
                    hmdVar = new jw2(xkl.b(sb8.j0(bundle, "type")), sb8.h0(bundle, "id"), ha9Var, 4);
                } else {
                    if (m65Var.equals(lmd.e)) {
                        long jH0 = sb8.h0(bundle, "id");
                        String strJ0 = sb8.j0(bundle, "type");
                        int iHashCode = strJ0.hashCode();
                        if (iHashCode != -759091500) {
                            if (iHashCode != 951526432) {
                                if (iHashCode == 1303205804) {
                                    strJ0.equals("local_chat");
                                }
                            } else if (strJ0.equals("contact")) {
                                kmdVar = kmd.CONTACT;
                            }
                        } else if (strJ0.equals("server_chat")) {
                            kmdVar = kmd.SERVER_CHAT;
                        }
                        kmd kmdVar2 = kmdVar;
                        Boolean boolW = sb8.W(bundle, "is_opened_from_dialog");
                        hmdVar = new dw2(jH0, kmdVar2, boolW != null ? boolW.booleanValue() : false, new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)));
                    } else if (m65Var.equals(lmd.f)) {
                        hmdVar = new ak1(sb8.h0(bundle, "id"), 1, ha9Var);
                    } else if (m65Var.equals(lmd.g)) {
                        hmdVar = new jw2(p63.a(sb8.j0(bundle, "type")), sb8.h0(bundle, "id"), ha9Var, 5);
                    } else if (m65Var.equals(lmd.h)) {
                        hmdVar = new ak1(sb8.h0(bundle, "id"), 2, ha9Var);
                    } else if (m65Var.equals(lmd.i)) {
                        hmdVar = new ak1(sb8.h0(bundle, "id"), 3, ha9Var);
                    } else if (m65Var.equals(lmd.j)) {
                        hmdVar = new ak1(sb8.h0(bundle, "id"), 4, ha9Var);
                    } else if (m65Var.equals(lmd.k)) {
                        hmdVar = new ak1(sb8.h0(bundle, "chat_id"), 5, ha9Var);
                    } else if (m65Var.equals(lmd.l)) {
                        hmdVar = new hmd(sb8.h0(bundle, "chat_id"), sb8.f0(bundle, "is_chat"), ha9Var, 0);
                    } else {
                        if (!m65Var.equals(lmd.m)) {
                            String name = jmd.class.getName();
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
                        long jH1 = sb8.h0(bundle, "chat_id");
                        Boolean boolW2 = sb8.W(bundle, "leave_chat");
                        hmdVar = new hmd(jH1, boolW2 != null ? boolW2.booleanValue() : false, ha9Var, 1);
                    }
                }
                return new u65(str, m65Var, bundle, 0, new q65(new vbd(22), new vbd(23)), false, hmdVar, 40);
            case 1:
                if (!((LinkedHashSet) ((ha2) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha2.c.getClass();
                if (m65Var.equals(ha2.d)) {
                    return new u65(str, m65Var, bundle, 1, null, false, new yj1(1, bundle), 48);
                }
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            case 2:
                if (!((LinkedHashSet) ((ij5) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var2 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                if (m65Var.equals(ij5.d) || m65Var.equals(ij5.j)) {
                    iVar = new i(5, ha9Var2);
                } else if (m65Var.equals(ij5.e)) {
                    iVar = new i(6, ha9Var2);
                } else if (m65Var.equals(ij5.k)) {
                    iVar = new i(7, ha9Var2);
                } else if (m65Var.equals(ij5.l)) {
                    iVar = new i(8, ha9Var2);
                } else if (m65Var.equals(ij5.g)) {
                    iVar = new i(9, ha9Var2);
                } else if (m65Var.equals(ij5.h)) {
                    iVar = new i(10, ha9Var2);
                } else {
                    if (!m65Var.equals(ij5.i)) {
                        if (m65Var.equals(ij5.m)) {
                            return null;
                        }
                        if (m65Var.equals(ij5.f)) {
                            ore.k("Недостижимый сценарий");
                            return null;
                        }
                        ore.k(qt4.m("Unknown route=", m65Var));
                        return null;
                    }
                    iVar = new i(11, ha9Var2);
                }
                return new u65(str, m65Var, bundle, 0, (m65Var.equals(ij5.l) || m65Var.equals(ij5.k)) ? s65.c : r65.c, false, iVar, 40);
            case 3:
                if (!((LinkedHashSet) ((ja8) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var3 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                ja8.c.getClass();
                if (m65Var.equals(ja8.d)) {
                    return new u65(str, m65Var, bundle, 1, new q65(new q38(4), new q38(5)), false, new i(13, ha9Var3), 32);
                }
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            case 4:
                if (!((LinkedHashSet) ((dob) this.b).b).contains(m65Var)) {
                    return null;
                }
                ha9 ha9Var4 = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                if (m65Var.equals(dob.d)) {
                    iVar2 = new i(17, ha9Var4);
                } else if (m65Var.equals(dob.e)) {
                    iVar2 = new i(18, ha9Var4);
                } else if (m65Var.equals(dob.f)) {
                    iVar2 = new i(19, ha9Var4);
                } else {
                    if (!m65Var.equals(dob.g)) {
                        ore.k("Unknown route");
                        return null;
                    }
                    iVar2 = new i(20, ha9Var4);
                }
                return new u65(str, m65Var, bundle, 0, null, false, iVar2, 56);
            default:
                if (!((LinkedHashSet) ((xqg) this.b).b).contains(m65Var)) {
                    return null;
                }
                int i = bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE);
                ha9 ha9Var5 = new ha9(i);
                r65 r65Var = r65.c;
                xqg.c.getClass();
                if (m65Var.equals(xqg.d)) {
                    String strJ1 = sb8.j0(bundle, ClientCookie.PATH_ATTR);
                    String string = bundle.getString("scope_id");
                    t3f t3fVar = string != null ? new t3f(string, ha9Var5) : t3f.a(pxg.a(), i, 1);
                    q65Var = new q65(new irf(23), new irf(24));
                    ooVar = new oo(27, t3fVar, ha9Var5, strJ1);
                } else {
                    if (m65Var.equals(xqg.e)) {
                        Long lY = sb8.Y(bundle, "story_id");
                        long jLongValue = lY != null ? lY.longValue() : 0L;
                        int iG0 = sb8.g0(bundle, "settings");
                        q65Var = new q65(new irf(25), new irf(26));
                        e75Var = new gad(jLongValue, iG0, ha9Var5, 1);
                    } else {
                        if (!m65Var.equals(xqg.f)) {
                            ore.k(qt4.m("invalid route ", m65Var));
                            return null;
                        }
                        Long lY2 = sb8.Y(bundle, "id");
                        int iG1 = sb8.g0(bundle, "type");
                        String string2 = bundle.getString("share_uri");
                        q65Var = new q65(new irf(27), new irf(28));
                        e75Var = new e75(lY2, iG1, string2, ha9Var5, 3);
                    }
                    ooVar = e75Var;
                }
                return new u65(str, m65Var, bundle, 1, q65Var, false, ooVar, 32);
        }
    }

    @Override // defpackage.h65
    public final f83 b() {
        switch (this.a) {
            case 0:
                return (lmd) this.b;
            case 1:
                return (ha2) this.b;
            case 2:
                return (ij5) this.b;
            case 3:
                return (ja8) this.b;
            case 4:
                return (dob) this.b;
            default:
                return (xqg) this.b;
        }
    }
}
