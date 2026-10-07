package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.startconversation.StartConversationScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qhg implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ qhg(StartConversationScreen startConversationScreen, RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = startConversationScreen;
        this.c = recyclerView;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        RecyclerView recyclerView = this.c;
        StartConversationScreen startConversationScreen = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                zv8[] zv8VarArr = StartConversationScreen.A;
                CharSequence charSequenceO1 = startConversationScreen.o1();
                if (charSequenceO1 == null || charSequenceO1.length() == 0) {
                    return null;
                }
                int iN = startConversationScreen.x.n(iIntValue);
                if (iN == R.id.oneme_contactlist_contact_view_type) {
                    return recyclerView.getResources().getString(R.string.search_all_contacts_header);
                }
                if (iN == R.id.oneme_contactlist_global_contact_view_type) {
                    return recyclerView.getResources().getString(R.string.search_global_contacts_header);
                }
                if (iN == R.id.oneme_contactlist_phonebook_contact_view_type) {
                    return recyclerView.getResources().getString(R.string.search_phonebook_contacts_header);
                }
                return null;
            default:
                zv8[] zv8VarArr2 = StartConversationScreen.A;
                CharSequence charSequenceO2 = startConversationScreen.o1();
                if ((charSequenceO2 == null || charSequenceO2.length() == 0) && startConversationScreen.x.n(iIntValue) == R.id.oneme_contactlist_phonebook_contact_view_type) {
                    return recyclerView.getResources().getString(R.string.oneme_startconversations_phonebook_section_header);
                }
                return null;
        }
    }
}
