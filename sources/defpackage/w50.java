package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public enum w50 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD"),
    VIDEO_MSG("VIDEO_MSG"),
    WIDGET("WIDGET"),
    POLL("POLL"),
    STORY_REPLY("STORY_REPLY");

    public static final HashSet A;
    public static final HashSet B;
    public static final HashSet u;
    public static final HashSet v;
    public static final HashSet w;
    public static final HashSet x;
    public static final HashSet y;
    public static final HashSet z;
    public final String a;

    static {
        w50 w50Var = PHOTO;
        w50 w50Var2 = VIDEO;
        w50 w50Var3 = AUDIO;
        w50 w50Var4 = SHARE;
        w50 w50Var5 = FILE;
        w50 w50Var6 = LOCATION;
        w50 w50Var7 = VIDEO_MSG;
        u = new HashSet(Arrays.asList(w50Var, w50Var2, w50Var3, w50Var4, w50Var5));
        v = new HashSet(Arrays.asList(w50Var, w50Var2));
        w = new HashSet(Collections.singletonList(w50Var4));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{w50Var5}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        x = new HashSet(Collections.unmodifiableList(arrayList));
        y = new HashSet(Collections.singletonList(w50Var3));
        z = new HashSet(Arrays.asList(w50Var3, w50Var7));
        A = new HashSet(Collections.singletonList(w50Var5));
        B = new HashSet(Collections.singletonList(w50Var6));
    }

    w50(String str) {
        this.a = str;
    }

    public static w50 a(String str) {
        str.getClass();
        switch (str) {
            case "STORY_REPLY":
                return STORY_REPLY;
            case "WIDGET":
                return WIDGET;
            case "LOCATION":
                return LOCATION;
            case "STICKER":
                return STICKER;
            case "VIDEO_MSG":
                return VIDEO_MSG;
            case "INLINE_KEYBOARD":
                return INLINE_KEYBOARD;
            case "APP":
                return APP;
            case "CALL":
                return CALL;
            case "FILE":
                return FILE;
            case "POLL":
                return POLL;
            case "AUDIO":
                return AUDIO;
            case "PHOTO":
                return PHOTO;
            case "SHARE":
                return SHARE;
            case "VIDEO":
                return VIDEO;
            case "PRESENT":
                return PRESENT;
            case "CONTACT":
                return CONTACT;
            case "CONTROL":
                return CONTROL;
            case "REPLY_KEYBOARD":
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}
