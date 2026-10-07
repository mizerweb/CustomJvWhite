package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mld {
    public final ifh a = new ifh(new vbd(9));

    public static jud b() {
        tnh tnhVar = new tnh(R.string.oneme_contact_block_bottom_sheet_title);
        tnh tnhVar2 = new tnh(R.string.oneme_contact_block_bottom_sheet_description);
        c79 c79VarW = yab.w();
        c79VarW.add(new kc4(R.id.profile_block_user_confirmation_sheet_confirm, new tnh(R.string.block), 3, true, 3, 2));
        c79VarW.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.dont_block), 2, true, 3, 2));
        return new jud(tnhVar, tnhVar2, yab.j(c79VarW), null);
    }

    public final jud a(int i, CharSequence charSequence, boolean z) {
        int i2;
        ynh tnhVar;
        int iD = qt4.D(i);
        int i3 = R.string.profile_leave_chat_bottom_sheet_cancel;
        if (iD == 0 || iD == 1) {
            vnh vnhVar = new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{charSequence}));
            c79 c79VarW = yab.w();
            c79VarW.add(new kc4(R.id.profile_leave_chat_confirmation_sheet_confirm, new tnh(R.string.leave_chat), 3, 32));
            c79VarW.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_leave_chat_bottom_sheet_cancel), 2, 32));
            return new jud(vnhVar, null, yab.j(c79VarW), null);
        }
        if (iD != 2) {
            if (iD == 3) {
                return d();
            }
            ore.o();
            return null;
        }
        if (z) {
            tnhVar = new tnh(R.string.profile_leave_channel_bottom_sheet_title);
            i2 = R.string.profile_leave_channel_bottom_sheet_confirm;
        } else {
            vnh vnhVar2 = new vnh(R.string.profile_unsubscribe_channel_header, a.n1(new Object[]{charSequence}));
            i3 = R.string.profile_unsubscribe_channel_action_cancel;
            i2 = R.string.profile_unsubscribe_channel_action_unsubscribe;
            tnhVar = vnhVar2;
        }
        tnh tnhVar2 = z ? new tnh(R.string.profile_leave_channel_admin_bottom_sheet_description) : null;
        c79 c79VarW2 = yab.w();
        c79VarW2.add(new kc4(R.id.profile_leave_chat_confirmation_sheet_confirm, new tnh(i2), 1, 56));
        c79VarW2.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(i3), 3, 56));
        return new jud(tnhVar, tnhVar2, yab.j(c79VarW2), null);
    }

    public final kc4 c() {
        return (kc4) this.a.getValue();
    }

    public final jud d() {
        xnh xnhVar = new xnh("Unsupported chat type");
        c79 c79VarW = yab.w();
        c79VarW.add(new kc4(R.id.profile_delete_chat_confirmation_sheet_confirm, new tnh(R.string.profile_delete_chat_bottom_sheet_confirm), 1, 56));
        c79VarW.add(c());
        return new jud(xnhVar, null, yab.j(c79VarW), null);
    }
}
