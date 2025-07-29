from flask import Flask
from flask_migrate import Migrate, migrate
from flask_sqlalchemy import SQLAlchemy

import config
db=SQLAlchemy()
migrate=Migrate()


def create_app():# 관례적으로 사용하는 이름임, user-defined function
    app= Flask(__name__)
    app.config.from_object(config)

    db.init_app(app)
    migrate.init_app(app,db)

    from . import models
    from .views import main_views
    app.register_blueprint(main_views.bp)
    return app
