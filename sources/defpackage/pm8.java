package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class pm8 extends wf4 {
    public final /* synthetic */ InviteFriendsToMaxBottomSheet s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm8(InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, Context context) {
        super(context);
        this.s = inviteFriendsToMaxBottomSheet;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        zv8[] zv8VarArr = InviteFriendsToMaxBottomSheet.D;
        InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = this.s;
        ((mm8) inviteFriendsToMaxBottomSheet.A.getValue()).B(inviteFriendsToMaxBottomSheet.G1(), true, inviteFriendsToMaxBottomSheet.z);
    }
}
