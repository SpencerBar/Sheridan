exports.showPage1 = (req, res) => {
    res.render("page1", { session: req.session });
}

exports.getUser = (req, res) => {
    req.session.username = req.body.username;
    res.render("page1", { session: req.session });
}

exports.showPage2 = (req, res) => {
    res.render("page2", { session: req.session });
}
