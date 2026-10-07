package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ru.ok.android.onelog.UploadService;

/* JADX INFO: loaded from: classes.dex */
public final class ia8 {
    public static final List l = xw3.P0(100, 300, 150, 450);
    public final boolean a;
    public final long b;
    public final et3 c;
    public final String d = ia8.class.getName();
    public final ny8 e;
    public final ny8 f;
    public final SharedPreferences g;
    public final LinkedHashMap h;
    public fa8 i;
    public Integer j;
    public af7 k;

    public ia8(boolean z, long j, et3 et3Var, Context context, ny8 ny8Var, ny8 ny8Var2) {
        this.a = z;
        this.b = j;
        this.c = et3Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("in_app_review_prefs", 0);
        this.g = sharedPreferences;
        this.h = new LinkedHashMap();
        fa8 fa8Var = null;
        Object obj = null;
        String string = sharedPreferences.getString("pref_current_condition", null);
        if (string != null) {
            y1 y1Var = new y1(i, fa8.k);
            while (y1Var.hasNext()) {
                Object next = y1Var.next();
                if (((fa8) next).a().equals(string)) {
                    obj = next;
                    break;
                }
            }
            fa8Var = (fa8) obj;
        }
        this.i = fa8Var;
    }

    public final void a() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ga8) it.next()).getClass();
        }
        this.g.edit().putString("pref_current_condition", null).apply();
        this.i = null;
    }

    public final void b(int i) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onInAppReviewFail(type=" + mw7.k(i) + ")", null);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 3) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1L).apply();
            this.g.edit().putLong("pref_last_fake_in_app_review_fail_time", jCurrentTimeMillis).apply();
            this.g.edit().putLong("pref_last_in_app_review_time", -1L).apply();
            d(null);
        } else {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1L).apply();
            this.g.edit().putLong("pref_last_fake_in_app_review_fail_time", -1L).apply();
            this.g.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void c(int i, Integer num) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onInAppReviewSuccess(type=" + mw7.k(i) + ", rating=" + num + ")", null);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i == 3) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", jCurrentTimeMillis).apply();
            this.g.edit().putLong("pref_last_fake_in_app_review_fail_time", -1L).apply();
            this.g.edit().putLong("pref_last_in_app_review_time", -1L).apply();
            d(num);
        } else {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1L).apply();
            this.g.edit().putLong("pref_last_fake_in_app_review_fail_time", -1L).apply();
            this.g.edit().putLong("pref_last_in_app_review_time", jCurrentTimeMillis).apply();
        }
        a();
    }

    public final void d(Integer num) {
        fa8 fa8Var = this.i;
        if (fa8Var == null) {
            gm0.Y(ia8.class.getName(), "Early return in sendAnalytics cuz of currentCondition is null");
            return;
        }
        Integer numC = fa8Var == fa8.PARTICIPATED_IN_CALL ? ((tbb) this.f.getValue()).c() : this.j;
        if (numC == null) {
            gm0.Y(ia8.class.getName(), "Early return in sendAnalytics cuz of currentCondition == InAppReviewConditionKey.PARTICIPATED_IN_CALL");
            return;
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("session_id", Long.valueOf(((xb9) this.c).Y()));
        ul9Var.put("screen_from", numC);
        ul9Var.put(UploadService.EXTRA_TRIGGER, fa8Var.a());
        if (num != null) {
            ul9Var.put("mark", Integer.valueOf(num.intValue()));
        }
        ae9.k((ae9) this.e.getValue(), "APP_REVIEW", "app_review", ul9Var.b(), 8);
    }

    public final void e(Integer num) {
        if (this.i == null) {
            return;
        }
        if (num == null) {
            num = ((tbb) this.f.getValue()).c();
        }
        if (ww3.j1(l, num)) {
            this.j = num;
            if (this.a) {
                gm0.n(this.d, "Show fakeInAppReview");
                pa8.b.j();
            } else {
                af7 af7Var = this.k;
                if (af7Var != null) {
                    af7Var.invoke();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Set set, y3f y3fVar) {
        Set<ha8> set2;
        boolean z;
        fa8 fa8Var;
        je9 je9Var = je9.d;
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            StringBuilder sb = new StringBuilder("triggerCondition(triggeredConditions=");
            set2 = set;
            sb.append(set2);
            sb.append(", screen=");
            sb.append(y3fVar);
            sb.append(")");
            a4cVar.c(je9Var, str, sb.toString(), null);
        } else {
            set2 = set;
        }
        fa8 fa8Var2 = this.i;
        if (fa8Var2 != null) {
            gm0.n(this.d, "InAppReviewConditionManager triggerCondition() currentCondition != null (" + fa8Var2 + ")");
            return;
        }
        if (((xb9) this.c).d0()) {
            gm0.n(this.d, "InAppReviewConditionManager isTimeAllowsStartInAppReview() clientPrefs.isDisableInAppReviewTimeCondition:" + ((xb9) this.c).d0());
            fa8Var = null;
            z = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - 259200000 < this.b) {
                gm0.n(this.d, "InAppReviewConditionManager isTimeAllowsStartInAppReview() hadCrashInPrevious3Days");
                fa8Var = null;
                z = false;
            } else {
                long j = this.g.getLong("pref_last_fake_in_app_review_success_time", -1L);
                long j2 = this.g.getLong("pref_last_fake_in_app_review_fail_time", -1L);
                long j3 = this.g.getLong("pref_last_in_app_review_time", -1L);
                if (!(j == -1 && j2 == -1 && j3 == -1) && ((j == -1 || jCurrentTimeMillis - j < 15552000000L) && ((j2 == -1 || jCurrentTimeMillis - j2 < 5184000000L) && (j3 == -1 || jCurrentTimeMillis - j3 < 5184000000L)))) {
                    String str2 = this.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        StringBuilder sbS = qt4.s(jCurrentTimeMillis, "InAppReviewConditionManager isTimeAllowsStartInAppReview() currentTime:", ", lastSuccessfulFakeReviewTime:");
                        sbS.append(j);
                        qt4.z(j2, ", lastFailedFakeReviewTime:", ", lastReviewTime:", sbS);
                        sbS.append(j3);
                        a4cVar2.c(je9Var, str2, sbS.toString(), null);
                    }
                    z = false;
                } else {
                    z = true;
                }
                String str3 = this.d;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    fa8Var = null;
                    a4cVar3.c(je9Var, str3, zo5.s("isTimeAllowsStartInAppReview(), verdict = ", z), null);
                } else {
                    fa8Var = null;
                }
            }
        }
        if (!z) {
            gm0.n(ia8.class.getName(), "Early return in triggerCondition cuz of !isTimeAllowsStartInAppReview()");
            return;
        }
        fa8 fa8VarA = fa8Var;
        for (ha8 ha8Var : set2) {
            String str4 = this.d;
            SharedPreferences sharedPreferences = this.g;
            int iOrdinal = ha8Var.a().ordinal();
            if (iOrdinal == 0) {
                int iB = ha8Var.b() + sharedPreferences.getInt("pref_sent_messages_count", 0);
                if (iB >= 5) {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", 0).apply();
                    fa8VarA = ha8Var.a();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", iB).apply();
                    gm0.n(str4, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + ha8Var + ", sentMessagesCount:" + iB);
                }
            } else if (iOrdinal == 3) {
                int iB2 = ha8Var.b() + sharedPreferences.getInt("pref_reactions_count", 0);
                if (iB2 >= 2) {
                    sharedPreferences.edit().putInt("pref_reactions_count", 0).apply();
                    fa8VarA = ha8Var.a();
                } else {
                    sharedPreferences.edit().putInt("pref_reactions_count", iB2).apply();
                    gm0.n(str4, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + ha8Var + ", addedReactionsCount:" + iB2);
                }
            } else if (iOrdinal == 4) {
                int iB3 = ha8Var.b() + sharedPreferences.getInt("pref_sent_stickers_count", 0);
                if (iB3 >= 3) {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", 0).apply();
                    fa8VarA = ha8Var.a();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", iB3).apply();
                    gm0.n(str4, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + ha8Var + ", sentStickersCount:" + iB3);
                }
            } else if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    int iB4 = ha8Var.b() + sharedPreferences.getInt("pref_made_pin_count", 0);
                    if (iB4 >= 2) {
                        sharedPreferences.edit().putInt("pref_made_pin_count", 0).apply();
                    } else {
                        sharedPreferences.edit().putInt("pref_made_pin_count", iB4).apply();
                        gm0.n(str4, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + ha8Var + ", madePinCount:" + iB4);
                    }
                }
                fa8VarA = ha8Var.a();
            } else {
                int iB5 = ha8Var.b() + sharedPreferences.getInt("pref_created_group_chats_count", 0);
                if (iB5 >= 2) {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", 0).apply();
                    fa8VarA = ha8Var.a();
                } else {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", iB5).apply();
                    gm0.n(str4, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + ha8Var + ", createdGroupChatsCount:" + iB5);
                }
            }
        }
        if (fa8VarA == null) {
            gm0.Y(ia8.class.getName(), "Early return in triggerCondition cuz of successfulCondition == null");
            return;
        }
        if (((ga8) this.h.get(fa8VarA)) == null) {
            gm0.Y(ia8.class.getName(), "Early return in triggerCondition cuz of keyToConditionDescriptor[successfulCondition] is null");
            return;
        }
        this.i = fa8VarA;
        SharedPreferences.Editor editorEdit = this.g.edit();
        fa8 fa8Var3 = this.i;
        editorEdit.putString("pref_current_condition", fa8Var3 != null ? fa8Var3.a() : fa8Var).apply();
        e(Integer.valueOf(y3fVar.a));
    }
}
