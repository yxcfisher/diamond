package com.ujia.jo;

import java.util.ArrayList;
import java.util.List;

import com.ujia.model.Banner;
import com.ujia.model.BannerDetails;

public class BannerJo extends Banner {
	List<BannerDetails> bannerDetailsList = new ArrayList<BannerDetails>();

	public List<BannerDetails> getBannerDetailsList() {
		return bannerDetailsList;
	}

	public void setBannerDetailsList(List<BannerDetails> bannerDetailsList) {
		this.bannerDetailsList = bannerDetailsList;
	}

}