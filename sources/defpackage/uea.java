package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uea {
    public final ny8 a;
    public volatile boolean b;
    public volatile boolean c;

    public uea(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(long j, int i, sdg sdgVar, int i2) {
        String str;
        ae9 ae9Var = (ae9) this.a.getValue();
        switch (i2) {
            case 1:
                str = "clicked_clickable_element";
                break;
            case 2:
                str = "clicked_copy";
                break;
            case 3:
                str = "clicked_open_link";
                break;
            case 4:
                str = "clicked_open_mail";
                break;
            case 5:
                str = "clicked_call";
                break;
            case 6:
                str = "shown_update_app";
                break;
            case 7:
                str = "clicked_update_app";
                break;
            default:
                throw null;
        }
        ylc ylcVar = new ylc("message_id", Long.valueOf(j));
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        i3 = 5;
                        if (i != 5) {
                            throw null;
                        }
                    }
                }
            }
        }
        ae9.k(ae9Var, "MESSAGE_CLICKABLE_ELEMENT_ACTIONS", str, ouk.a(ylcVar, new ylc("element_type", Integer.valueOf(i3)), new ylc("source_id", Long.valueOf(sdgVar.a)), new ylc("source_type", Integer.valueOf(sdgVar.b))), 8);
    }
}
