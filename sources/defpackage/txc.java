package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class txc extends a8j {
    public final pyc c;
    public final dzc d;
    public final ny8 e;
    public final mjg f;
    public final r8e g;
    public final mjg h;
    public final r8e i;
    public final ic6 j;
    public final mjg k;
    public final r8e l;

    public txc(m8b m8bVar, pyc pycVar, dzc dzcVar, xhh xhhVar, ny8 ny8Var) {
        this.c = pycVar;
        this.d = dzcVar;
        this.e = ny8Var;
        mjg mjgVarA = p90.a(s66.a);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(m8bVar);
        this.h = mjgVarA2;
        this.i = new r8e(mjgVarA2);
        this.j = new ic6(null);
        mjg mjgVarA3 = p90.a("");
        this.k = mjgVarA3;
        xx6 xx6VarI = e9i.I(e9i.F(mjgVarA3, 200L));
        Object value = mjgVarA3.getValue();
        this.l = e9i.G0(xx6VarI, this.b, j0g.a, value);
        e9i.j0(e9i.T(e9i.k0(mjgVarA2, new awa(this, (lq4) null, 24)), ((n0c) xhhVar).b()), this.b);
        dzcVar.a(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    public final void B(xyc xycVar, boolean z, py2 py2Var, boolean z2, int i) {
        Integer numValueOf;
        Integer numValueOf2;
        ynh rnhVar = null;
        if (z) {
            mjg mjgVar = this.h;
            m8b m8bVarE = rx8.e((m8b) mjgVar.getValue());
            long j = xycVar.a;
            boolean zN = m8bVarE.n(j);
            dzc dzcVar = this.d;
            if (zN) {
                dzcVar.e(j);
            } else {
                m8bVarE.a(j);
                dzcVar.c(xycVar);
            }
            mjgVar.j(null, m8bVarE);
            return;
        }
        int i2 = xycVar.c;
        if (i != 0) {
            numValueOf2 = Integer.valueOf(R.drawable.icon_warning_fill);
            int iD = qt4.D(i);
            ny8 ny8Var = this.e;
            if (iD == 0) {
                rnhVar = new rnh(z2 ? R.plurals.picker_chats_chat_limit_add_participant_error : R.plurals.picker_chats_channel_limit_add_subscribers_error, ((g5d) ((gjf) ny8Var.getValue())).d(), a.n1(new Object[]{Integer.valueOf(((g5d) ((gjf) ny8Var.getValue())).d())}));
            } else if (iD != 1) {
                ore.o();
                return;
            } else if (z2) {
                rnhVar = new rnh(R.plurals.picker_chats_chat_participant_count_limit_error, ((g5d) ((gjf) ny8Var.getValue())).i(), a.n1(new Object[]{Integer.valueOf(((g5d) ((gjf) ny8Var.getValue())).i())}));
            }
        } else {
            int iD2 = qt4.D(i2);
            int i3 = R.string.picker_chats_adding_disabled_to_channel_bot;
            int i4 = R.string.picker_chats_creating_disabled_channel_bot;
            if (iD2 == 0) {
                int i5 = sxc.$EnumSwitchMapping$2[py2Var.ordinal()];
                if (i5 == 1) {
                    numValueOf = null;
                } else if (i5 == 2) {
                    numValueOf = Integer.valueOf(R.string.picker_chats_forward_disabled_channel);
                } else if (i5 == 3) {
                    if (z2) {
                        i3 = R.string.picker_chats_adding_disabled_bot;
                    }
                    numValueOf = Integer.valueOf(i3);
                } else if (i5 != 4) {
                    ore.o();
                    return;
                } else {
                    if (z2) {
                        i4 = R.string.picker_chats_creating_disabled_bot;
                    }
                    numValueOf = Integer.valueOf(i4);
                }
            } else if (iD2 == 1) {
                int i6 = sxc.$EnumSwitchMapping$2[py2Var.ordinal()];
                if (i6 == 1) {
                    numValueOf = null;
                } else if (i6 == 2) {
                    numValueOf = Integer.valueOf(R.string.picker_dialog_forward_disabled);
                } else if (i6 == 3) {
                    numValueOf = Integer.valueOf(z2 ? R.string.picker_dialog_adding_disabled : R.string.picker_dialog_adding_disabled_to_channel);
                } else {
                    if (i6 != 4) {
                        ore.o();
                        return;
                    }
                    numValueOf = Integer.valueOf(z2 ? R.string.picker_dialog_creating_disabled : R.string.picker_dialog_creating_disabled_channel);
                }
            } else if (iD2 != 4) {
                int i7 = sxc.$EnumSwitchMapping$2[py2Var.ordinal()];
                if (i7 == 1) {
                    numValueOf = null;
                } else if (i7 == 2) {
                    numValueOf = Integer.valueOf(R.string.picker_chats_forward_disabled_default);
                } else if (i7 == 3) {
                    numValueOf = Integer.valueOf(z2 ? R.string.picker_chats_adding_disabled_default : R.string.picker_chats_adding_disabled_to_channel_default);
                } else {
                    if (i7 != 4) {
                        ore.o();
                        return;
                    }
                    numValueOf = Integer.valueOf(z2 ? R.string.picker_chats_creating_disabled_default : R.string.picker_chats_creating_disabled_channel_default);
                }
            } else {
                int i8 = sxc.$EnumSwitchMapping$2[py2Var.ordinal()];
                if (i8 == 1) {
                    numValueOf = null;
                } else if (i8 == 2) {
                    numValueOf = Integer.valueOf(R.string.picker_chats_forward_disabled_bot);
                } else if (i8 == 3) {
                    if (z2) {
                        i3 = R.string.picker_chats_adding_disabled_bot;
                    }
                    numValueOf = Integer.valueOf(i3);
                } else if (i8 != 4) {
                    ore.o();
                    return;
                } else {
                    if (z2) {
                        i4 = R.string.picker_chats_creating_disabled_bot;
                    }
                    numValueOf = Integer.valueOf(i4);
                }
            }
            if (numValueOf != null) {
                tnh tnhVar = new tnh(numValueOf.intValue());
                numValueOf2 = null;
                rnhVar = tnhVar;
            } else {
                numValueOf2 = null;
            }
        }
        if (rnhVar != null) {
            a8j.x(this.j, new vxc(rnhVar, numValueOf2));
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        this.d.b();
    }
}
