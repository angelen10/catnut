/*
 * The MIT License (MIT)
 * Copyright (c) 2014 longkai
 * The software shall be used for good, not evil.
 */
package tingting.chen.tingting;

import java.util.Map;

/**
 * 新浪微博api抽象，封装了一些api信息
 *
 * @author longkai
 */
public class TingtingAPI {

	/** 新浪微博api域名（注意貌似有些api不是用这个的=.=） */
	public static final String API_DOMAIN = "https://api.weibo.com";

	/** {@link com.android.volley.Request.Method} */
	public final int method;
	/** http uri */
	public final String uri;
	/** 是否需要传递access token */
	public final boolean authRequired;
	/** 是否需要在map里设置请求参数，通常用于post和put方法，没有赋null即可 */
	public final Map<String, ?> params;

	public TingtingAPI(int method, String uri, boolean authRequired, Map<String, ?> params) {
		this.method = method;
		this.uri = uri;
		this.authRequired = authRequired;
		this.params = params;
	}
}
