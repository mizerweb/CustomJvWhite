package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jol;
import defpackage.pkk;
import defpackage.yab;
import defpackage.z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends z3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new pkk(2);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public String g;
    public final long h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final HashSet m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = arrayList;
        this.k = str7;
        this.l = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        yab.p(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.i.equals(this.i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.j);
        hashSet.addAll(googleSignInAccount.m);
        HashSet hashSet2 = new HashSet(this.j);
        hashSet2.addAll(this.m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.o(parcel, 2, this.b);
        jol.o(parcel, 3, this.c);
        jol.o(parcel, 4, this.d);
        jol.o(parcel, 5, this.e);
        jol.n(parcel, 6, this.f, i);
        jol.o(parcel, 7, this.g);
        jol.s(parcel, 8, 8);
        parcel.writeLong(this.h);
        jol.o(parcel, 9, this.i);
        jol.r(parcel, this.j, 10);
        jol.o(parcel, 11, this.k);
        jol.o(parcel, 12, this.l);
        jol.u(iT, parcel);
    }
}
