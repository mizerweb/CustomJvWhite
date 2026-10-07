package one.me.chats.search.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.us3;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/chats/search/views/ClearRecentSearchBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "one/me/chats/search/ChatsListSearchScreen", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ClearRecentSearchBottomSheet extends BottomSheetWidget {
    public ClearRecentSearchBottomSheet() {
        super(new Bundle());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new us3(frameLayout, this, getContext());
    }
}
