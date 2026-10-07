package defpackage;

import kotlin.collections.a;
import one.me.settings.AccountActionsBottomSheet;
import one.me.settings.SettingsListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class k5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AccountActionsBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(lq4 lq4Var, AccountActionsBottomSheet accountActionsBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = accountActionsBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AccountActionsBottomSheet accountActionsBottomSheet = this.g;
        switch (i) {
            case 0:
                k5 k5Var = new k5(lq4Var, accountActionsBottomSheet, 0);
                k5Var.f = obj;
                return k5Var;
            default:
                k5 k5Var2 = new k5(lq4Var, accountActionsBottomSheet, 1);
                k5Var2.f = obj;
                return k5Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((k5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((k5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AccountActionsBottomSheet accountActionsBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (!cqk.d((l5) obj2, l5.b)) {
                    ore.o();
                    return null;
                }
                br4 targetController = accountActionsBottomSheet.getTargetController();
                SettingsListScreen settingsListScreen = targetController instanceof SettingsListScreen ? (SettingsListScreen) targetController : null;
                if (settingsListScreen != null) {
                    a8j.x(settingsListScreen.t1().z, new ouf(new vnh(R.string.oneme_settings_all_chats_read_snackbar, a.n1(new Object[]{accountActionsBottomSheet.u})), Integer.valueOf(R.drawable.icon_check_round_fill)));
                }
                accountActionsBottomSheet.v1(true);
                return sbiVar;
            default:
                ch3.d0(obj);
                int iIntValue = ((Number) obj2).intValue();
                zv8[] zv8VarArr = AccountActionsBottomSheet.z;
                accountActionsBottomSheet.F1().setVisibility(iIntValue > 0 ? 0 : 8);
                if (iIntValue > 0) {
                    accountActionsBottomSheet.F1().setTitle(accountActionsBottomSheet.getContext().getResources().getQuantityString(R.plurals.oneme_settings_mark_as_read_chats, iIntValue, new Integer(iIntValue)));
                }
                return sbiVar;
        }
    }
}
