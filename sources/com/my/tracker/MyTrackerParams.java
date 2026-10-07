package com.my.tracker;

import android.text.TextUtils;
import com.my.tracker.core.UserInfoState;
import com.my.tracker.core.utils.ArrayUtils;
import com.my.tracker.core.utils.Consumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MyTrackerParams {
    final List a = new ArrayList();
    final Object b = new Object();
    volatile UserInfoState c = UserInfoState.EMPTY;
    final Map d = new ConcurrentHashMap();
    volatile String e = null;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public static class ReadOnlyCopy {
        public final Map<String, String> customParams;
        public final String lang;

        public ReadOnlyCopy(String str, Map<String, String> map) {
            this.lang = str;
            this.customParams = new HashMap(map);
        }
    }

    private void a(UserInfoState userInfoState) {
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(userInfoState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public int getAge() {
        return this.c.age;
    }

    public String getCustomParam(String str) {
        return (String) this.d.get(str.toLowerCase(Locale.ROOT));
    }

    public String getCustomUserId() {
        return b(this.c.customUserIds);
    }

    public String[] getCustomUserIds() {
        return a(this.c.customUserIds);
    }

    public String getEmail() {
        return b(this.c.emails);
    }

    public String[] getEmails() {
        return a(this.c.emails);
    }

    public int getGender() {
        return this.c.gender;
    }

    public String getIcqId() {
        return b(this.c.icqIds);
    }

    public String[] getIcqIds() {
        return a(this.c.icqIds);
    }

    public String getLang() {
        return this.e;
    }

    public String getOkId() {
        return b(this.c.okIds);
    }

    public String[] getOkIds() {
        return a(this.c.okIds);
    }

    public String getPhone() {
        return b(this.c.phones);
    }

    public String[] getPhones() {
        return a(this.c.phones);
    }

    public String getVkConnectId() {
        return b(this.c.vkConnectIds);
    }

    public String[] getVkConnectIds() {
        return a(this.c.vkConnectIds);
    }

    public String getVkId() {
        return b(this.c.vkIds);
    }

    public String[] getVkIds() {
        return a(this.c.vkIds);
    }

    public MyTrackerParams setAge(int i) {
        synchronized (this.b) {
            try {
                if (this.c.age != i) {
                    UserInfoState userInfoState = new UserInfoState(i, this.c.gender, this.c.okIds, this.c.vkIds, this.c.emails, this.c.icqIds, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setCustomParam(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Map map = this.d;
        if (str2 == null) {
            map.remove(lowerCase);
            return this;
        }
        map.put(lowerCase, str2);
        return this;
    }

    public MyTrackerParams setCustomUserId(String str) {
        return setCustomUserIds(a(str));
    }

    public MyTrackerParams setCustomUserIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.customUserIds, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, this.c.vkIds, this.c.emails, this.c.icqIds, strArrA, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setEmail(String str) {
        return setEmails(a(str));
    }

    public MyTrackerParams setEmails(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.emails, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, this.c.vkIds, strArrA, this.c.icqIds, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setGender(int i) {
        synchronized (this.b) {
            try {
                if (this.c.gender != i) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, i, this.c.okIds, this.c.vkIds, this.c.emails, this.c.icqIds, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setIcqId(String str) {
        return setIcqIds(a(str));
    }

    public MyTrackerParams setIcqIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.icqIds, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, this.c.vkIds, this.c.emails, strArrA, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setLang(String str) {
        this.e = str;
        return this;
    }

    public MyTrackerParams setOkId(String str) {
        return setOkIds(a(str));
    }

    public MyTrackerParams setOkIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.okIds, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, strArrA, this.c.vkIds, this.c.emails, this.c.icqIds, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setPhone(String str) {
        return setPhones(a(str));
    }

    public MyTrackerParams setPhones(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.phones, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, this.c.vkIds, this.c.emails, this.c.icqIds, this.c.customUserIds, strArrA, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkConnectId(String str) {
        return setVkConnectIds(a(str));
    }

    public MyTrackerParams setVkConnectIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.vkConnectIds, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, this.c.vkIds, this.c.emails, this.c.icqIds, this.c.customUserIds, this.c.phones, strArrA);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkId(String str) {
        return setVkIds(a(str));
    }

    public MyTrackerParams setVkIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] strArrA = a(strArr);
                if (ArrayUtils.compareArrays(this.c.vkIds, strArr) != 0) {
                    UserInfoState userInfoState = new UserInfoState(this.c.age, this.c.gender, this.c.okIds, strArrA, this.c.emails, this.c.icqIds, this.c.customUserIds, this.c.phones, this.c.vkConnectIds);
                    a(userInfoState);
                    this.c = userInfoState;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void a(Consumer consumer, Consumer consumer2) {
        synchronized (this.b) {
            synchronized (this.a) {
                consumer.accept(this.c);
                this.a.add(consumer2);
            }
        }
    }

    private static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    public ReadOnlyCopy a() {
        return new ReadOnlyCopy(this.e, this.d);
    }
}
