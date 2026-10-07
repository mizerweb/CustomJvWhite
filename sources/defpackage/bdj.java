package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 bdj[], still in use, count: 1, list:
  (r0v19 bdj[]) from 0x0130: CONSTRUCTOR (r0v19 bdj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class bdj {
    /* JADX INFO: Fake field, exist only in values array */
    MONEY_BUTTON(1, "money_button"),
    /* JADX INFO: Fake field, exist only in values array */
    START_BUTTON(2, "start_button"),
    URL(3, MLFeatureConfigProviderBase.URL_KEY),
    FOLDER(4, "folder"),
    /* JADX INFO: Fake field, exist only in values array */
    INLINE_BUTTON(5, "inline_button"),
    WEB_APP(6, "web_app"),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS(7, "settings"),
    EXTERNAL_CALLBACK(8, "external_callback"),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_PRIVACY(9, "settings_privacy"),
    CHAT_PROFILE(11, "chat_profile"),
    /* JADX INFO: Fake field, exist only in values array */
    PUSH(12, "push"),
    BOTTOMBAR(13, "bottombar"),
    /* JADX INFO: Fake field, exist only in values array */
    MONEY_BUTTON_MORE(14, "money_button_more"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORT_FROM_PRIVACY(1000, "support_from_privacy"),
    FROM_NOTIFICATION(1001, "from_notification"),
    FROM_SEARCH(10, "from_search"),
    CHATS_LIST_BUTTON(15, "chats_list_button"),
    SEARCH_BUTTON(16, "search_button"),
    /* JADX INFO: Fake field, exist only in values array */
    FROM_CREATE_CHANNEL(17, "from_create_channel"),
    ONBOARDING(18, "onboarding"),
    ORGANIZATION_IN_PROFILE(19, "organization_in_profile");

    public static final /* synthetic */ ma6 p;
    public final String a;
    public final int b;

    static {
        p = new ma6(bdjVarArr);
    }

    public bdj(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static bdj valueOf(String str) {
        return (bdj) Enum.valueOf(bdj.class, str);
    }

    public static bdj[] values() {
        return (bdj[]) o.clone();
    }

    public final String a() {
        return this.a;
    }
}
