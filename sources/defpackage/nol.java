package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nol {
    public static v0f a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new v0f();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
            return new v0f(map);
        }
        bundle.setClassLoader(v0f.class.getClassLoader());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ApiProtocol.PARAM_KEYS);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            ore.k("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new v0f(linkedHashMap);
    }

    public static final j7i b() {
        return new j7i(new tnh(R.string.oneme_settings_twofa_restore_delete_user_confirmation_title), new tnh(R.string.oneme_settings_twofa_restore_delete_user_confirmation_description), xw3.P0(new kc4(R.id.oneme_settings_twofa_delete_user_confirmation_action, new tnh(R.string.oneme_settings_twofa_restore_delete_user_confirmation_action), 3, true, 3, 1), new kc4(R.id.oneme_settings_twofa_delete_user_confirmation_skip, new tnh(R.string.oneme_settings_twofa_restore_delete_user_confirmation_cancel), 2, 32)), y3f.SETTINGS_2FA_PROFILE_DELETE);
    }
}
